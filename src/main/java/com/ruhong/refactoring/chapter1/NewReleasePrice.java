package com.ruhong.refactoring.chapter1;

/**
 * @author ruhong
 **/

public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
