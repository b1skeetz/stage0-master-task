package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        if(numberTableToPrint >= 0){
            for(int i = 1; i <= 10; i++){
                System.out.println(String.format("%d x %d = %d", i, numberTableToPrint, i*numberTableToPrint));
            }
            return;
        }
        System.out.println("Input number must be positive!");
    }

}
