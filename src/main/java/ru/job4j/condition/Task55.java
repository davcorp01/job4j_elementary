package ru.job4j.condition;

public class Task55 {
    public static void apartmentPlace(int number) {
        int floor, pos;
        if ((double) number / 3 * 10 % 10 > 0) {
            floor = number / 3 + 1;
            pos = number % 3;
        } else {
            floor = number / 3;
            pos = 3;
        }
        System.out.println(floor);
        System.out.println(pos);
    }
}