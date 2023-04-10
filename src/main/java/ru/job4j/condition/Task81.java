package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 81. Является ли символ буквой латинского алфавита
https://job4j.ru/profile/topics/13/task_code/357/158969
 */
public class Task81 {
    public static void isLatin(char s) {
        if (s >= 65 && s <= 90 || s >= 97 && s <= 122) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
