package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 70. Преобразовать секунды в минуты
https://job4j.ru/profile/topics/13/task_code/346/158290
 */
public class Task70 {
    public static void secondsToMinutes(int seconds) {
        int min = seconds / 60;
        int sec = seconds - min * 60;
        if (seconds > 3600) {
            System.out.println("Расчет не производится");
        } else {
            System.out.println("Минут: " + min + ", секунд: " + sec);
        }
    }
}
