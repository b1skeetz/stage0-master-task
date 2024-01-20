package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(month > 12 || month < 1 || year <= 0){
            System.out.println("invalid date");
            return;
        }
        int daysInMonth = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
            default -> 31;
        };
        System.out.println(daysInMonth);
    }

}
