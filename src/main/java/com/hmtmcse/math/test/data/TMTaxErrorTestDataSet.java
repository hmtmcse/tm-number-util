package com.hmtmcse.math.test.data;

import com.hmtmcse.math.TMMath;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class TMTaxErrorTestDataSet {


    private List<TMTaxErrorTestData> dataSet = new ArrayList<>();

    public TMTaxErrorTestDataSet(){


        dataSet.add(new TMTaxErrorTestData(10.1239, 1).setTaxRateInclusive(20.0).setOutTaxRate(10.0));
        dataSet.add(new TMTaxErrorTestData(10.99952, 1).setTaxRateInclusive(5.0).setOutTaxRate(5.0));
        dataSet.add(new TMTaxErrorTestData(25.26, 1).setTaxRateInclusive(5.0).setOutTaxRate(5.0));
        dataSet.add(new TMTaxErrorTestData(25.255, 1).setTaxRateInclusive(5.0).setOutTaxRate(5.0));
        dataSet.add(new TMTaxErrorTestData(10.049, 1).setTaxRateInclusive(5.0).setOutTaxRate(5.0));

        dataSet.add(new TMTaxErrorTestData(2036854.58, 1).setTaxRateInclusive(1000.0).setOutTaxRate(1000.0));
        dataSet.add(new TMTaxErrorTestData(203685477.58, 1).setTaxRateInclusive(200.0).setOutTaxRate(200.0));

        dataSet.add(new TMTaxErrorTestData(10.99, 1).setTaxRateInclusive(50.0).setOutTaxRate(50.0));
        dataSet.add(new TMTaxErrorTestData(4.00, 1).setTaxRateInclusive(0.25).setOutTaxRate(0.26));

        dataSet.add(new TMTaxErrorTestData(2.00, 1).setTaxRateInclusive(0.26).setOutTaxRate(0.25));
        dataSet.add(new TMTaxErrorTestData(4.00, 1).setTaxRateInclusive(0.50).setOutTaxRate(0.50));
        dataSet.add(new TMTaxErrorTestData(2.00, 1).setTaxRateInclusive(0.25).setOutTaxRate(0.25));
        dataSet.add(new TMTaxErrorTestData(0.02, 1).setTaxRateInclusive(1.97).setOutTaxRate(200.00));
        dataSet.add(new TMTaxErrorTestData(0.94, 1).setTaxRateInclusive(59.95).setOutTaxRate(50.00));
        dataSet.add(new TMTaxErrorTestData(0.94, 1).setTaxRateInclusive(59.95).setOutTaxRate(50.00));
        dataSet.add(new TMTaxErrorTestData(13.83, 1).setTaxRateInclusive(59.95).setOutTaxRate(50.00));
        dataSet.add(new TMTaxErrorTestData(123.46, 1).setTaxRateInclusive(59.95).setOutTaxRate(50.00));
        dataSet.add(new TMTaxErrorTestData(123.46, 1).setTaxRateInclusive(59.95).setOutTaxRate(50.00));

        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(100.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(200.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(300.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(400.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(500.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(600.));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(700.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(800.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(900.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(1000.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(1100.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(1200.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(1300.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(1400.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(1500.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(1600.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(1700.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(1800.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(1900.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(2000.0));

        dataSet.add(new TMTaxErrorTestData(1.70, 3));
        dataSet.add(new TMTaxErrorTestData(1.70, 1).setTaxRateInOutSame(10.0));
        dataSet.add(new TMTaxErrorTestData(28.37, 50).setTaxRateInOutSame(10.0));


    }


    public static List<TMTaxErrorTestData> data(){
        return new TMTaxErrorTestDataSet().dataSet;
    }


}
