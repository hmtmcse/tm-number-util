package com.hmtmcse.math.test.data;

import java.util.ArrayList;
import java.util.List;

public class TMTaxErrorTestDataSet {


    private List<TMTaxErrorTestData> dataSet = new ArrayList<>();

    public TMTaxErrorTestDataSet(){
        dataSet.add(new TMTaxErrorTestData(1.70, 3));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(100.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(200.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(300.0));
        dataSet.add(new TMTaxErrorTestData(22.95, 1).setTaxRateInOutSame(400.0));
        dataSet.add(new TMTaxErrorTestData(1.70, 1).setTaxRateInOutSame(10.0));
    }


    public static List<TMTaxErrorTestData> data(){
        return new TMTaxErrorTestDataSet().dataSet;
    }


}
