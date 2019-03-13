package com.hmtmcse.math;

import java.math.BigDecimal;

public class TMTaxHelper {


    public static Double getPriceFromTaxInclusivePrice(Double price, Double taxRatePercentage){
        return TMMath.start(price).subtract(getTaxFromTaxInclusivePrice(price, taxRatePercentage)).toDouble();
    }


    public static Double getTaxFromTaxInclusivePrice(Double price, Double taxRatePercentage){
        BigDecimal dividend = TMMath.start(price).multiply(taxRatePercentage).toBigDecimal();
        BigDecimal divisor  = TMMath.start(taxRatePercentage).add(100).toBigDecimal();
        return TMMath.start(dividend).divide(divisor).toDouble();
    }

    public static Double calculateTax(Double price, Double taxRatePercentage){
        BigDecimal dividend = TMMath.start(price).multiply(taxRatePercentage).toBigDecimal();
        return TMMath.start(dividend).divide(100).toDouble();
    }

}
