package com.hmtmcse.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TMMath {

    public static RoundingMode divideRoundMode = RoundingMode.HALF_UP;
    public static Integer divideRoundScale = 32;

    private BigDecimal bigDecimal = null;

    public TMMath(Double number) {
        this.bigDecimal = toBigDecimal(number);
    }

    public TMMath(Long number) {
        this.bigDecimal = toBigDecimal(number);
    }

    public TMMath(Float number) {
        this.bigDecimal = toBigDecimal(number);
    }

    public TMMath(BigDecimal number) {
        this.bigDecimal = number;
    }

    public TMMath(String number) {
        this.bigDecimal = toBigDecimal(number);
    }


    private TMMath() {}

    public TMMath(Integer number) {
        this.bigDecimal = toBigDecimal(number);
    }

    public BigDecimal toBigDecimal(Double number){
        return BigDecimal.valueOf(number);
    }

    public BigDecimal toBigDecimal(Integer number){
        return BigDecimal.valueOf(number);
    }

    public BigDecimal toBigDecimal(String number){
        return new BigDecimal(number);
    }

    public BigDecimal toBigDecimal(Long number){
        return BigDecimal.valueOf(number);
    }


    public BigDecimal toBigDecimal(Float number){
        return BigDecimal.valueOf(number);
    }


    public BigDecimal toBigDecimal(){
        return this.bigDecimal;
    }

    public Double toDouble(){
        return this.bigDecimal.doubleValue();
    }


    public String toPlainString(){
        return this.bigDecimal.toPlainString();
    }

    public Long toLong(){
        return this.bigDecimal.longValue();
    }

    public Integer toInteger(){
        return this.bigDecimal.intValue();
    }


    public String toString(){
        return this.bigDecimal.toString();
    }

    private BigDecimal addToBigDecimal(BigDecimal bigDecimal){
        return this.bigDecimal.add(bigDecimal);
    }

    public TMMath add(BigDecimal ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.addToBigDecimal(number[i]);
        }
        return this;
    }

    public TMMath add(Double ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.addToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath add(Integer ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.addToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath add(Long ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.addToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath add(Float ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.addToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath add(BigDecimal number){
        this.bigDecimal = this.bigDecimal.add(number);
        return this;
    }

    public TMMath add(Double number){
        this.bigDecimal = this.bigDecimal.add(this.toBigDecimal(number));
        return this;
    }

    public TMMath add(Integer number){
        this.bigDecimal = this.bigDecimal.add(this.toBigDecimal(number));
        return this;
    }

    public TMMath add(Long number){
        this.bigDecimal = this.bigDecimal.add(this.toBigDecimal(number));
        return this;
    }


    public TMMath add(Float number){
        this.bigDecimal = this.bigDecimal.add(this.toBigDecimal(number));
        return this;
    }

    public TMMath multiply(BigDecimal number){
        this.bigDecimal = this.bigDecimal.multiply(number);
        return this;
    }

    public TMMath multiply(Double number){
        this.bigDecimal = this.bigDecimal.multiply(this.toBigDecimal(number));
        return this;
    }

    public TMMath multiply(Integer number){
        this.bigDecimal = this.bigDecimal.multiply(this.toBigDecimal(number));
        return this;
    }

    public TMMath multiply(Long number){
        this.bigDecimal = this.bigDecimal.multiply(this.toBigDecimal(number));
        return this;
    }


    public TMMath multiply(Float number){
        this.bigDecimal = this.bigDecimal.multiply(this.toBigDecimal(number));
        return this;
    }

    private BigDecimal multiplyToBigDecimal(BigDecimal bigDecimal){
        return this.bigDecimal.multiply(bigDecimal);
    }

    public TMMath multiply(BigDecimal ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.multiplyToBigDecimal(number[i]);
        }
        return this;
    }

    public TMMath multiply(Double ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.multiplyToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath multiply(Integer ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.multiplyToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath multiply(Long ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.multiplyToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath multiply(Float ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.multiplyToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath subtract(BigDecimal number){
        this.bigDecimal = this.bigDecimal.subtract(number);
        return this;
    }

    public TMMath subtract(Double number){
        this.bigDecimal = this.bigDecimal.subtract(this.toBigDecimal(number));
        return this;
    }

    public TMMath subtract(Integer number){
        this.bigDecimal = this.bigDecimal.subtract(this.toBigDecimal(number));
        return this;
    }

    public TMMath subtract(Long number){
        this.bigDecimal = this.bigDecimal.subtract(this.toBigDecimal(number));
        return this;
    }


    public TMMath subtract(Float number){
        this.bigDecimal = this.bigDecimal.subtract(this.toBigDecimal(number));
        return this;
    }

    private BigDecimal subtractToBigDecimal(BigDecimal bigDecimal){
        return this.bigDecimal.subtract(bigDecimal);
    }

    public TMMath subtract(BigDecimal ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.subtractToBigDecimal(number[i]);
        }
        return this;
    }

    public TMMath subtract(Double ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.subtractToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath subtract(Integer ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.subtractToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath subtract(Long ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.subtractToBigDecimal(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath subtract(Float ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = this.bigDecimal.subtract(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath divide(Double number, RoundingMode roundingMode){
        this.bigDecimal = this.bigDecimal.divide(this.toBigDecimal(number), roundingMode);
        return this;
    }

    public TMMath divide(Double number, RoundingMode roundingMode, Integer scale){
        this.bigDecimal = this.bigDecimal.divide(this.toBigDecimal(number), scale,  roundingMode);
        return this;
    }

    private BigDecimal divideWithScaleAndMode(BigDecimal number){
        return this.bigDecimal.divide(number, divideRoundScale,  divideRoundMode);
    }

    public TMMath divide(BigDecimal number){
        this.bigDecimal = divideWithScaleAndMode(number);
        return this;
    }

    public TMMath divide(Double number){
        this.bigDecimal = divideWithScaleAndMode(this.toBigDecimal(number));
        return this;
    }

    public TMMath divide(Integer number){
        this.bigDecimal = divideWithScaleAndMode(this.toBigDecimal(number));
        return this;
    }

    public TMMath divide(Long number){
        this.bigDecimal = divideWithScaleAndMode(this.toBigDecimal(number));
        return this;
    }


    public TMMath divide(Float number){
        this.bigDecimal = divideWithScaleAndMode(this.toBigDecimal(number));
        return this;
    }

    public TMMath divide(BigDecimal ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = divideWithScaleAndMode(number[i]);
        }
        return this;
    }

    public TMMath divide(Double ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = divideWithScaleAndMode(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath divide(Integer ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = divideWithScaleAndMode(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath divide(Long ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = divideWithScaleAndMode(this.toBigDecimal(number[i]));
        }
        return this;
    }

    public TMMath divide(Float ...number) {
        for (int i = 0; i < number.length; i++){
            this.bigDecimal = divideWithScaleAndMode(this.toBigDecimal(number[i]));
        }
        return this;
    }

    private BigDecimal roundBig(Integer scale, RoundingMode roundingMode){
        return this.bigDecimal.setScale(scale, roundingMode);
    }

    public TMMath round(Integer scale, RoundingMode roundingMode){
        this.bigDecimal = this.roundBig(scale, roundingMode);
        return this;
    }

    public TMMath mathRound(Integer scale){
        this.bigDecimal = this.roundBig(scale, RoundingMode.HALF_UP);
        return this;
    }

    public static TMMath start(Long number){
        return new TMMath(number);
    }

    public static TMMath start(Float number){
        return new TMMath(number);
    }


    public static TMMath start(Integer number){
        return new TMMath(number);
    }


    public static TMMath start(Double number){
        return new TMMath(number);
    }

    public static TMMath start(BigDecimal number){
        return new TMMath(number);
    }


    public static TMMath fromString(String number){
        return new TMMath(number);
    }

}
