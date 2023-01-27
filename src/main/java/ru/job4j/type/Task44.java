package ru.job4j.type;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        int numLast1 = number1 % 10;
        int numLast2 = number2 % 10;
        int numFirst1 = number1 / 10;
        int numFirst2 = number2 / 10;
        System.out.println(numFirst1 * 10 + numLast2);
        System.out.println(numFirst2 * 10 + numLast1);
    }
}
