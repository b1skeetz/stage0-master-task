package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        if(number > 9999 || number < 1000) {
            //System.out.println("Incorrect number format");
            return;
        }
        int numFirst = number / 1000;
        int numSecond = number / 100 % 10;
        int numThird = (number / 10) % 10;
        int numLast = number % 10;
        int result = numFirst + numSecond + numThird + numLast;
        //System.out.println(numFirst + numSecond + numThird + numLast);
    }

}
