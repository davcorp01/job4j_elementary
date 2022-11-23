package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        for (int index = a; index <= b; index++) {
            a = a * index;
            System.out.println(a);
        }
        return a;
    }
}