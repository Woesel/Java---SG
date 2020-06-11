package com.tenzin.lesson05;

import java.math.BigDecimal;

/**
 *
 * @author Tenzin Woesel Jun 5, 2020
 */
public class AppForBigDecimal {

    public static void main(String[] args) {

        BigDecimalMath myMath = new BigDecimalMath();

        BigDecimal op1 = new BigDecimal("10");
        BigDecimal op2 = new BigDecimal("3");
        
        System.out.println(myMath.calculate(MathOperator.PLUS, op1, op2));
        System.out.println(myMath.calculate(MathOperator.MINUS, op1, op2));
        System.out.println(myMath.calculate(MathOperator.MULTIPLY, op1, op2));
        System.out.println(myMath.calculate(MathOperator.DIVIDE, op1, op2));

    }
}
