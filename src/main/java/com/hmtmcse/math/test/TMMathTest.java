package com.hmtmcse.math.test;

import com.hmtmcse.console.table.common.TableConstant;
import com.hmtmcse.console.table.data.Table;
import com.hmtmcse.console.table.data.TableRowData;
import com.hmtmcse.math.TMMath;
import com.hmtmcse.math.test.data.TMMathTestData;
import com.hmtmcse.math.test.data.TMMathTestDataSet;
import javafx.beans.binding.ObjectExpression;

import java.math.BigDecimal;


public class TMMathTest {


    private static Object firstNumber;
    private static Object secondNumber;

    public static String math(Object result, String sign){
        return firstNumber + " " + sign + " " + secondNumber + " = " + result;
    }

    public static void doubleTest(){
        Table table = new Table();
        TableRowData rowData = new TableRowData();

        rowData.add("Double Add", TableConstant.LEFT_ALIGN, TableConstant.RED);
        rowData.add("TMMath Add", TableConstant.LEFT_ALIGN, TableConstant.RED);

        rowData.add("Double Subtract", TableConstant.LEFT_ALIGN, TableConstant.BLUE);
        rowData.add("TMMath Subtract", TableConstant.LEFT_ALIGN, TableConstant.BLUE);

        rowData.add("Double Divide", TableConstant.LEFT_ALIGN, TableConstant.YALLOW);
        rowData.add("TMMath Divide", TableConstant.LEFT_ALIGN, TableConstant.YALLOW);

        rowData.add("Double Multiply", TableConstant.LEFT_ALIGN, TableConstant.RED);
        rowData.add("TMMath Multiply", TableConstant.LEFT_ALIGN, TableConstant.RED);
        table.addRow(rowData);


        for (TMMathTestData<Double> data: TMMathTestDataSet.instance().getDoubleData()){
            rowData = new TableRowData();
            firstNumber = data.firstNumber;
            secondNumber = data.secondNumber;

            rowData.add(math(data.firstNumber + data.secondNumber, "+"), TableConstant.LEFT_ALIGN, TableConstant.RED);
            rowData.add(math(TMMath.start(data.firstNumber).add(data.secondNumber).toDouble(), "+"), TableConstant.LEFT_ALIGN, TableConstant.RED);

            rowData.add(math(data.firstNumber - data.secondNumber , "-"), TableConstant.LEFT_ALIGN, TableConstant.BLUE);
            rowData.add(math(TMMath.start(data.firstNumber).subtract(data.secondNumber).toDouble() , "-"), TableConstant.LEFT_ALIGN, TableConstant.BLUE);


            rowData.add(math(data.firstNumber / data.secondNumber , "/"), TableConstant.LEFT_ALIGN, TableConstant.YALLOW);
            rowData.add(math(TMMath.start(data.firstNumber).divide(data.secondNumber).toDouble() , "/"), TableConstant.LEFT_ALIGN, TableConstant.YALLOW);

            rowData.add(math(new BigDecimal(data.firstNumber * data.secondNumber).toPlainString() , "*"), TableConstant.LEFT_ALIGN, TableConstant.RED);
            rowData.add(math(TMMath.start(data.firstNumber).multiply(data.secondNumber).toPlainString() , "*"), TableConstant.LEFT_ALIGN, TableConstant.RED);

            table.addRow(rowData);
        }
        table.toTablePrint();
    }


    public static void main(String[] args) {
            doubleTest();
    }
}
