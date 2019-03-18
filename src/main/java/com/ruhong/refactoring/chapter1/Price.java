package com.ruhong.refactoring.chapter1;

/**
 * @author ruhong
 **/

public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
