package ru.job4j.type;

public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        int numFirst1 = number1 / 100;
        int numFirst2 = number2 / 100;
        int numLast1 = (number1 / 10) % 10 * 10 + number1 % 10;
        int numLast2 = (number2 / 10) % 10 * 10 + number2 % 10;
        System.out.println(numFirst2 * 100 + numLast1);
        System.out.println(numFirst1 * 100 + numLast2);
    }
}
