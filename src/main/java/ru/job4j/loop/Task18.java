package ru.job4j.loop;

import java.util.StringJoiner;

public class Task18 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1; i < 19; i++) {
            if ((i / 10) >= 1 && i % 2 == 0) {
                if (i % 4 == 0) {
                    stringJoiner.add(i + "#");
                } else {
                    stringJoiner.add("" + i);
                }
            }
        }
        System.out.println("Начало");
        System.out.println(stringJoiner);
        System.out.println("Конец");
    }
}