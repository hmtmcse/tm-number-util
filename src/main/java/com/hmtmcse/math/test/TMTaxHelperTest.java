package com.hmtmcse.math.test;

import com.hmtmcse.math.TMTaxHelper;

public class TMTaxHelperTest {

    public static void main(String[] args) {

        double percentage = 10;
        double priceWithTax = 60;
        System.out.println("Price " + priceWithTax + " Taka with inclusive Tax " + percentage + "%");
        double tax = (priceWithTax * percentage) / (percentage + 100);
        double realPrice = priceWithTax - tax;
        System.out.println("Tax " + tax);
        System.out.println("Real Price " + realPrice);

        System.out.println(TMTaxHelper.getTaxFromTaxInclusivePrice(60.00, 10.00));
        System.out.println(TMTaxHelper.getPriceFromTaxInclusivePrice(60.00, 10.00));

        System.out.println(TMTaxHelper.getTaxFromTaxInclusivePrice(20.00, 200.00));
        System.out.println(TMTaxHelper.getPriceFromTaxInclusivePrice(20.00, 200.00));
    }
}
