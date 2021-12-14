package ru.job4j.condition;

public class Types {
    public static void main(String[] args) {
        long l = 129;
        byte b = (byte) l;
        System.out.println("#1 Было: " + l + " Стало: " + b);

        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("#2 Было: " + (f + i) + " Стало: " + rsl);

        char c = 45000;
        float ii = c;
        System.out.println("#3 Было: " + c + " Стало: " + ii);

        double d = 121.19;
        byte bb = (byte) d;
        System.out.println("#4 Было: " + d + " Стало: " + bb);

        short s = 1500;
        char cc = (char) s;
        double dd = cc;
        System.out.println("#5 Было: " + s + " Потом: " + cc + " Стало: " + dd);
    }
}