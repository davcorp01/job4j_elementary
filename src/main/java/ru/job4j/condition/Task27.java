package ru.job4j.condition;

public class Task27 {
    public static void isEnough(int pupils, int chairs) {
        String lable = pupils <= chairs ? "Да" : "Нет";
        System.out.println(lable);
    }
}