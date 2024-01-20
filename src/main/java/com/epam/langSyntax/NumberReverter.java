package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int numBeginToEnd = number / 100;
        int numCenter = (number / 10) % 10;
        int numEndToBegin = number % 10;
        System.out.println(numEndToBegin * 100 + numCenter * 10 + numBeginToEnd);
    }
}