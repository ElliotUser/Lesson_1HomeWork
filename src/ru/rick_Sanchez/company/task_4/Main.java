package ru.rick_Sanchez.company.task_4;
/*Написать метод, которому в качестве параметра передается
строка, обозначающая имя, метод должен вернуть приветственное
сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.*/

public class Main {
    public static void main(String[] args) {
        enterName("Ингеборга Дапкунайте!");
    }

    public static void enterName(String name){
        System.out.println("Привет, "+name);
    }
}
