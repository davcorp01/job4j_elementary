package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 66. Определить время дня по часу
https://job4j.ru/profile/topics/13/task_code/342/157860
 */
public class Task66 {
    public static void daytime(int number) {
        if (number > 23 || number < 0) {
            System.out.println("Не является часом");
        } else if (number >= 6 && number <= 10) {
            System.out.println("Утро");
        } else if (number >= 11 && number <= 17) {
            System.out.println("День");
        } else if (number >= 18 && number <= 22) {
            System.out.println("Вечер");
        } else {
            System.out.println("Ночь");
        }
    }
}
