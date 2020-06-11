package com.tenzin.lesson05;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Tenzin Woesel Jun 5, 2020
 */
public class BigDecimalExample {

    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("42.35");

//        BigDecimal b=  a.setScale(1); //ERROR
        BigDecimal b = a.setScale(1, RoundingMode.HALF_UP);

        System.out.println(b); //42.4

        b = a.setScale(1, RoundingMode.HALF_DOWN);
        System.out.println(b); //42.3

        BigDecimal op1 = new BigDecimal("10");
        BigDecimal op2 = new BigDecimal("6");

        //BigDecimal c = op1.divide(op2); //ERROR
        BigDecimal c = op1.divide(op2, RoundingMode.HALF_UP);  // 2
        System.out.println(c);

        c = op1.divide(op2, 2, RoundingMode.HALF_DOWN); //1.67
        System.out.println(c); //1.67
        
        c = op1.divide(op2, 2, RoundingMode.DOWN); //1.66
        System.out.println(c);

    }

}
