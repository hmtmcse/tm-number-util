package com.hmtmcse.math.test.ecommerce;

import com.hmtmcse.console.table.common.TableConstant;
import com.hmtmcse.console.table.data.Table;
import com.hmtmcse.console.table.data.TableRowData;
import com.hmtmcse.math.TMMath;
import com.hmtmcse.math.TMTaxHelper;
import com.hmtmcse.math.test.data.TMTaxErrorTestData;
import com.hmtmcse.math.test.data.TMTaxErrorTestDataSet;

import java.math.RoundingMode;

public class TaxErrorTest {

    private static Integer scale = 4;

    public static Double roundUp(Double data){
        return TMMath.start(data).round(scale, RoundingMode.UP).toDouble();
    }

    public static Double roundDown(Double data){
        return TMMath.start(data).round(scale, RoundingMode.DOWN).toDouble();
    }

    public static Double roundNearest(Double data){
        return TMMath.start(data).round(scale, RoundingMode.HALF_UP).toDouble();
    }


    public static void main(String[] args) {
        Table table = new Table();
        TableRowData rowData = new TableRowData();

        rowData.add("#", TableConstant.LEFT_ALIGN, TableConstant.BLUE);
        rowData.add("Price Tax Inclusive", TableConstant.LEFT_ALIGN, TableConstant.RED);
        rowData.add("In Tax Rate", TableConstant.LEFT_ALIGN, TableConstant.YELLOW);

        rowData.add("Price", TableConstant.LEFT_ALIGN, TableConstant.BLUE);
        rowData.add("Tax", TableConstant.LEFT_ALIGN, TableConstant.RED);

        rowData.add("Out Tax Rate", TableConstant.LEFT_ALIGN, TableConstant.YELLOW);
        rowData.add("Out Tax", TableConstant.LEFT_ALIGN, TableConstant.BLUE);

        rowData.add("Out Tax Inclusive Price", TableConstant.LEFT_ALIGN, TableConstant.RED);
        table.addRow(rowData);


        System.out.println("");
        System.out.println("Fraction Number will be UP, Down, Nearest");
        Integer serial = 1;
        Table report = null;
        for (TMTaxErrorTestData errorTestData: TMTaxErrorTestDataSet.data()){
            rowData = new TableRowData();
            rowData.add(serial , TableConstant.LEFT_ALIGN, TableConstant.BLUE);
            rowData.add(errorTestData.price , TableConstant.LEFT_ALIGN, TableConstant.RED);
            rowData.add(errorTestData.taxRateInclusive , TableConstant.LEFT_ALIGN, TableConstant.YELLOW);

            Double price = TMTaxHelper.getPriceFromTaxInclusivePrice(errorTestData.price, errorTestData.taxRateInclusive);
            String priceString = price + " " + "(" + roundUp(price) + ") (" + roundDown(price) + " (" + roundNearest(price) + ")";
            rowData.add(priceString, TableConstant.LEFT_ALIGN, TableConstant.BLUE);

            Double tax = TMTaxHelper.getTaxFromTaxInclusivePrice(errorTestData.price, errorTestData.taxRateInclusive);
            String taxString = tax + " " + "(" + roundUp(tax) + ") (" + roundDown(tax) + ") (" + roundNearest(tax) + ")";
            rowData.add(taxString, TableConstant.LEFT_ALIGN, TableConstant.RED);

            rowData.add(errorTestData.outTaxRate, TableConstant.LEFT_ALIGN, TableConstant.YELLOW);

            Double outTax = TMTaxHelper.calculateTax(price, errorTestData.outTaxRate);
            String outTaxString = outTax + " " + "(" + roundUp(outTax) + ") (" + roundDown(outTax) + ") (" + roundNearest(outTax) + ")";
            rowData.add(outTaxString, TableConstant.LEFT_ALIGN, TableConstant.BLUE);

            Double outTaxInclusivePrice = TMMath.start(price).add(outTax).toDouble();
            String outTaxInclusivePriceString = outTaxInclusivePrice + " " + "(" + roundUp(outTaxInclusivePrice) + ") (" + roundDown(outTaxInclusivePrice) + ") (" + roundNearest(outTaxInclusivePrice) + ")";

            rowData.add(outTaxInclusivePriceString, TableConstant.LEFT_ALIGN, TableConstant.RED);
            table.addRow(rowData);

            report = roundingReport(errorTestData.taxRateInclusive, errorTestData.outTaxRate, errorTestData.price, price, outTax, serial, report);
            serial++;
        }



        table.toTablePrint();

        System.out.println("");
        System.out.println("");
        if (report != null){
            report.toTablePrint();
        }
    }

    public static Table roundingReport(Double taxIncRate, Double taxOutRate,Double taxIncPrice, Double price, Double outTax, Integer serial, Table table){

        TableRowData rowData;
        if (table == null){
            table = new Table();
            rowData = new TableRowData();

            rowData.add("#", TableConstant.LEFT_ALIGN, TableConstant.BLUE);
            rowData.add("Price", TableConstant.LEFT_ALIGN, TableConstant.YELLOW);
            rowData.add("Tax In Rate", TableConstant.LEFT_ALIGN, TableConstant.YELLOW);
            rowData.add("Tax Out Rate", TableConstant.LEFT_ALIGN, TableConstant.YELLOW);

            rowData.add("UP + UP", TableConstant.LEFT_ALIGN, TableConstant.RED);
            rowData.add("UP + Down", TableConstant.LEFT_ALIGN, TableConstant.YELLOW);
            rowData.add("UP + Nearest", TableConstant.LEFT_ALIGN, TableConstant.BLUE);

            rowData.add("Down + UP", TableConstant.LEFT_ALIGN, TableConstant.RED);
            rowData.add("Down + Down", TableConstant.LEFT_ALIGN, TableConstant.YELLOW);
            rowData.add("Down + Nearest", TableConstant.LEFT_ALIGN, TableConstant.BLUE);


            rowData.add("Nearest + UP", TableConstant.LEFT_ALIGN, TableConstant.RED);
            rowData.add("Nearest + Down", TableConstant.LEFT_ALIGN, TableConstant.YELLOW);
            rowData.add("Nearest + Nearest", TableConstant.LEFT_ALIGN, TableConstant.BLUE);

            table.addRow(rowData);
        }

        rowData = new TableRowData();
        rowData.add(serial, TableConstant.LEFT_ALIGN, TableConstant.RED);
        rowData.add(taxIncPrice, TableConstant.LEFT_ALIGN, TableConstant.YELLOW);
        rowData.add(taxIncRate, TableConstant.LEFT_ALIGN, TableConstant.BLUE);
        rowData.add(taxOutRate, TableConstant.LEFT_ALIGN, TableConstant.YELLOW);

        rowData.add(TMMath.start(roundUp(price)).add(roundUp(outTax)), TableConstant.LEFT_ALIGN, TableConstant.RED);
        rowData.add(TMMath.start(roundUp(price)).add(roundDown(outTax)), TableConstant.LEFT_ALIGN, TableConstant.YELLOW);
        rowData.add(TMMath.start(roundUp(price)).add(roundNearest(outTax)), TableConstant.LEFT_ALIGN, TableConstant.BLUE);


        rowData.add(TMMath.start(roundDown(price)).add(roundUp(outTax)), TableConstant.LEFT_ALIGN, TableConstant.RED);
        rowData.add(TMMath.start(roundDown(price)).add(roundDown(outTax)), TableConstant.LEFT_ALIGN, TableConstant.YELLOW);
        rowData.add(TMMath.start(roundDown(price)).add(roundNearest(outTax)), TableConstant.LEFT_ALIGN, TableConstant.BLUE);


        rowData.add(TMMath.start(roundNearest(price)).add(roundUp(outTax)), TableConstant.LEFT_ALIGN, TableConstant.RED);
        rowData.add(TMMath.start(roundNearest(price)).add(roundDown(outTax)), TableConstant.LEFT_ALIGN, TableConstant.YELLOW);
        rowData.add(TMMath.start(roundNearest(price)).add(roundNearest(outTax)), TableConstant.LEFT_ALIGN, TableConstant.BLUE);

        table.addRow(rowData);

        return table;
    }

}
