package ru.job4j.condition;

public class Task54 {
    public static void transform(int number) {
        int num1 = number / 100;
        int num2 = Math.abs(number / 10 % 10);
        int num3 = Math.abs(number % 10);
        boolean even = number % 2 == 0;
        int negative = 1;
        if (num1 < 0) {
            num1 = Math.abs(num1);
            negative = -1;
        }
        if (num1 % 2 == 0 && even) {
            num1 = num1 + 1;
        } else if (num1 % 2 != 0 && even) {
            num1 = num1 - 1;
        } else if (num1 % 2 == 0) {
            num1 = num1 - 1;
        } else if (num1 != 9) {
            num1 = num1 + 1;
        }
        if (num2 % 2 == 0 && even) {
            num2 = num2 + 1;
        } else if (num2 % 2 != 0 && num2 != 1 && even) {
            num2 = num2 - 1;
        } else if (num2 % 2 == 0 && num2 != 0) {
            num2 = num2 - 1;
        } else if (num2 % 2 != 0 && num2 != 9 && !even) {
            num2 = num2 + 1;
        }
        if (num3 % 2 == 0 && even) {
            num3 = num3 + 1;
        } else if (num3 % 2 != 0 && num3 != 1 && even) {
            num3 = num3 - 1;
        } else if (num3 % 2 == 0) {
            num3 = num3 - 1;
        } else if (num3 != 9 && !even) {
            num3 = num3 + 1;
        }
        System.out.println((num1 * 100 + num2 * 10 + num3) * negative);
    }
}
