package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        System.out.println(String.format("Before swap: (%d, %d)", first, second));
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(String.format("After swap: (%d, %d)", first, second));
    }

}
