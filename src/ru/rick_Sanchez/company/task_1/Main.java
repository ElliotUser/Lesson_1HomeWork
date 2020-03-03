package ru.rick_Sanchez.company.task_1;

public class Main {
    /*Написать метод вычисляющий выражение a * (b + (c / d))
    и возвращающий результат с плавающей точкой, где a, b, c, d –
    целочисленные входные параметры этого метода;*/

    private static double result;

    public static void main(String[] args) {
        double result = floating_point_number(7,6,6,30);
        System.out.println(result);

    }

    public static double floating_point_number(int a, int b, double c, double d){
        return result = a*(b+(c/d));
    }
}
