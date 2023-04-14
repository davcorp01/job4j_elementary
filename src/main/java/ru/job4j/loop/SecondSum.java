package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int result = a;
        for (int i = a; i <= b; i += 2) {
            if (a != i) {
                result = result + i;
            }
        }
        return result;
    }
}
