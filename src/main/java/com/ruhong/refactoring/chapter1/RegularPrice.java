package com.ruhong.refactoring.chapter1;

/**
 * @author ruhong
 **/

public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
}
