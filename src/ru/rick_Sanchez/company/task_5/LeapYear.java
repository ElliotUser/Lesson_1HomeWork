package ru.rick_Sanchez.company.task_5;

public class LeapYear {
    //Тут нужно ввести нужный год
    static int year = 100;

    public static void main(String[] args) {
        to_Сalculate_A_Leap_Year(year);
    }

    public static void to_Сalculate_A_Leap_Year(int year) {
        if(year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год високосный.");
        } else if(year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год високосный.");
        } else if(year % 100 == 0) {
            System.out.println(year + " год не високосный");
        } else {
            System.out.println(year + " год не високосный");
        }

    }
}
