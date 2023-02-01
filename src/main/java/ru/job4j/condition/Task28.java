package ru.job4j.condition;

public class Task28 {
    public static void isEnough(int pupils, int desks) {
        String lable = desks * 2 >= pupils ? "Да" : "Нет";
        System.out.println(lable);
    }
}
