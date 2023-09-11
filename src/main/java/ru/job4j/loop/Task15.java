package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 15. Вывод положительных трехзначных чисел в диапазоне
https://job4j.ru/profile/topics/14/task_code/361/173668
 */
import java.util.StringJoiner;
public class Task15 {
    public static void loop(int a, int  b) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = b; i > a; i--) {
            if (i > 0 && i / 100 >= 1) {
                stringJoiner.add("" + i + "");
            } else {
                break;
            }
        }
        System.out.println("Старт");
        System.out.println(stringJoiner);
        System.out.println("Финиш");

}
}