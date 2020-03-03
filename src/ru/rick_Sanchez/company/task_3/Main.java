package ru.rick_Sanchez.company.task_3;
/*Написать метод, которому в качестве параметра
передается целое число, метод должен проверить
положительное ли число передали, или отрицательное.
Замечание: ноль считаем положительным числом. Результат
работы метода вывести в консоль*/

public class Main {
    public static void main(String[] args) {
        isPositiveNumber(6);
    }

    public static void isPositiveNumber(int number){
        if(number < 0){
            System.out.println("You entered a negative number "+ number);
        }else if(number >= 0){
            System.out.println("You entered a positive number "+ number);
        }
    }
}
