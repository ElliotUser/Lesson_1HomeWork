package ru.rick_Sanchez.company.task_2;

/*Написать метод, принимающий на вход два целых числа, и
проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
если да – вернуть true, в противном случае – false;*/

public class Main {
    public static void main(String[] args) {
        System.out.println(range(2,3));
    }

    public static boolean range(int a, int b){
        int sum = a+b;
        for(int i = 10; i <= 20; i++) {
            if(sum == i){
                return true;
            }
        }return false;
    }
}
