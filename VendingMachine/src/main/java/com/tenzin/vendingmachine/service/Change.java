package com.tenzin.vendingmachine.service;

import java.math.BigDecimal;

/**
 *
 * @author Tenzin Woesel Jun 9, 2020
 */
public class Change {

    BigDecimal numOfCents;
    BigDecimal numOfNickels;
    BigDecimal numOfDimes;
    BigDecimal numOfQuarters;

    public BigDecimal getCent() {
        return numOfCents;
    }

    public BigDecimal getNickel() {
        return numOfNickels;
    }

    public BigDecimal getDime() {
        return numOfDimes;
    }

    public BigDecimal getQuarter() {
        return numOfQuarters;
    }

    public void setNumOfCents(BigDecimal numOfCents) {
        this.numOfCents = numOfCents;
    }

    public void setNumOfNickels(BigDecimal numOfNickels) {
        this.numOfNickels = numOfNickels;
    }

    public void setNumOfDimes(BigDecimal numOfDimes) {
        this.numOfDimes = numOfDimes;
    }

    public void setNumOfQuarters(BigDecimal numOfQuarters) {
        this.numOfQuarters = numOfQuarters;
    }

}
