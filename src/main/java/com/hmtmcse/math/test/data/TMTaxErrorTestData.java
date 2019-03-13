package com.hmtmcse.math.test.data;


public class TMTaxErrorTestData{

    public Double price;
    public Integer quantity;
    public Double taxRateInclusive = 0.0;
    public Double outTaxRate = 0.0;


    public TMTaxErrorTestData(Double price, Integer quantity, Double taxRateInclusive, Double outTaxRate) {
        this.price = price;
        this.quantity = quantity;
        this.taxRateInclusive = taxRateInclusive;
        this.outTaxRate = outTaxRate;
    }

    public TMTaxErrorTestData(Double price, Integer quantity, Double taxRateInclusive) {
        this.price = price;
        this.quantity = quantity;
        this.taxRateInclusive = taxRateInclusive;
    }

    public TMTaxErrorTestData(Double price, Integer quantity) {
        this.price = price;
        this.quantity = quantity;
    }


    public TMTaxErrorTestData setTaxRateInclusive(Double taxRateInclusive) {
        this.taxRateInclusive = taxRateInclusive;
        return this;
    }

    public TMTaxErrorTestData setOutTaxRate(Double outTaxRate) {
        this.outTaxRate = outTaxRate;
        return this;
    }

    public TMTaxErrorTestData setTaxRateInOutSame(Double taxRateInclusive) {
        this.taxRateInclusive = taxRateInclusive;
        this.outTaxRate = taxRateInclusive;
        return this;
    }
}
