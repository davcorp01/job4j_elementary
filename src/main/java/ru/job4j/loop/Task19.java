package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 19. Вывести положительные трехзначные числа, оканчивающиеся на 7
https://job4j.ru/profile/topics/14/task_code/365/181737
 */
import java.util.StringJoiner;

public class Task19 {
    public static void loop() {
        StringJoiner stringJoiner  = new StringJoiner(" ");
        for (int i = 99; i < 153; i++) {
            if ((i / 100) >= 1 && i % 10 == 7 && i > 0) {
                stringJoiner.add("" + i);
            }
        }
            System.out.println("Старт");
            System.out.println(stringJoiner);
            System.out.println("Финиш");
    }
}
