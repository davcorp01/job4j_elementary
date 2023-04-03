package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 71. Минимальный набор купюр
https://job4j.ru/profile/topics/13/task_code/347/158291
 */
public class Task71 {
    public static void change(int money) {
        int hundred = money / 100;
        int fifty  = (money - hundred * 100) / 50;
        int ten = (money - hundred * 100 - fifty * 50) / 10;
        if (money % 10 != 0) {
            System.out.println("Нельзя");
        } else {
            System.out.println("100: " + hundred + ", 50: " + fifty + ", 10: " + ten);
        }
    }
}
