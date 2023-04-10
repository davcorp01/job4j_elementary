package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 83. Тезки и однофамильцы
https://job4j.ru/profile/topics/13/task_code/359/158972
 */
public class Task83 {
    public static void isEquals(String name1, String surname1, String name2, String surname2) {
        if (name1 == name2 && surname1 != surname2) {
            System.out.println("Тезки");
        } else if (name1 != name2 && surname1 == surname2) {
            System.out.println("Однофамильцы");
        } else if (name1 == name2 && surname1 == surname2) {
            System.out.println("Тезки и однофамильцы");
        } else {
            System.out.println("Совпадений нет");
        }
    }
}