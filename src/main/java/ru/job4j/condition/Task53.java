package ru.job4j.condition;

public class Task53 {
    public static void transformFraction(int num1, int num2) {
        if (num1 > num2) {
            int whole = (num1 / num2);
            double quotient = ((double) num1 / (double) num2 - (double) whole) * num2;
            System.out.println(whole + " " + quotient + "/" + num2);
        } else if (num1 == num2) {
            System.out.println(1);
        } else if (num1 < num2) {
            System.out.println("Подсчет не производится");
        }
    }
}