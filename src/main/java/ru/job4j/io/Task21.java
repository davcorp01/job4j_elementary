package ru.job4j.io;
/*
Job4j Упражнения 1.1.1. Вывод информации на консоль 21. Вывод текста из нескольких строк в рамке из "звёздочек"
https://job4j.ru/profile/topics/1/task_code/251/157978
 */
public class Task21 {
    public static void main(String[] args) {
        String fullName = "Фамилия Имя Отчество";
        String phoneNumber = "+7 938 123 45 67";
        System.out.println("************************");
        System.out.println("* " + fullName + " *");
        System.out.println("* +7(938) 123-45-67    *");
        System.out.print("************************");
    }
}
