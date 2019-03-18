package com.ruhong.refactoring.chapter1;

/**
 * @author ruhong
 **/

public class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
