package com.hmtmcse.math.test.data;



import com.hmtmcse.math.TMMath;

import java.util.ArrayList;
import java.util.List;

public class TMMathTestDataSet{


    private List<TMMathTestData<String>> dataSet = new ArrayList<>();

    public TMMathTestDataSet(){
        dataSet.add(new TMMathTestData<String>("0.10", "0.13"));

        dataSet.add(new TMMathTestData<String>("0.01", "0.02"));
        dataSet.add(new TMMathTestData<String>("0.02", "0.03"));
        dataSet.add(new TMMathTestData<String>("0.03", "0.04"));
        dataSet.add(new TMMathTestData<String>("0.04", "0.05"));
        dataSet.add(new TMMathTestData<String>("0.05", "0.06"));
        dataSet.add(new TMMathTestData<String>("0.06", "0.07"));
        dataSet.add(new TMMathTestData<String>("0.07", "0.08"));
        dataSet.add(new TMMathTestData<String>("0.08", "0.09"));
        dataSet.add(new TMMathTestData<String>("0.09", "0.01"));
    }


    public List<TMMathTestData<Double>> getDoubleData(){
        List<TMMathTestData<Double>> dataList = new ArrayList<>();
        for (TMMathTestData<String> data: dataSet){
            dataList.add(new TMMathTestData<Double>(TMMath.fromString(data.firstNumber).toDouble(), TMMath.fromString(data.secondNumber).toDouble()));
        }
        return dataList;
    }


    public static TMMathTestDataSet instance(){
        return new TMMathTestDataSet();
    }


}
