package ru.job4j.io;
/*
Job4j Упражнения 1.1.1. Вывод информации на консоль 22. Форматированный вывод
https://job4j.ru/profile/topics/1/task_code/302/157981
 */
public class Task22 {
    public static void nameInsert(String name) {
        //String name = "Николай";
        String result = String.format("Привет, %s!", name);
        System.out.println(result);
    }
}