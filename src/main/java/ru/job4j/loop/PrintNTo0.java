package ru.job4j.loop;

public class PrintNTo0 {
    public static void out(int n) {
        for (int index = n; index > 0; index--) {
            n--;
            System.out.println(n);
        }
    }
}