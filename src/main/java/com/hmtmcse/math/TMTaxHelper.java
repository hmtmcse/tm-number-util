package com.hmtmcse.math;

import java.math.BigDecimal;

public class TMTaxHelper {


    public static Double getPriceFromTaxInclusivePrice(Double price, Double taxRate){
        return TMMath.start(price).subtract(getTaxFromTaxInclusivePrice(price, taxRate)).toDouble();
    }


    public static Double getTaxFromTaxInclusivePrice(Double price, Double taxRate){
        BigDecimal dividend = TMMath.start(price).multiply(taxRate).toBigDecimal();
        BigDecimal divisor  = TMMath.start(taxRate).add(100).toBigDecimal();
        return TMMath.start(dividend).divide(divisor).toDouble();
    }

}
