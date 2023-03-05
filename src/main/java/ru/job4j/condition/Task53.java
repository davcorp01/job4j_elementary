package ru.job4j.condition;

public class Task53 {
    public static void transformFraction(int num1, int num2) {
        double test = (double) num1 / (double) num2 * 10 % 10;
        if (test != 0) {
            if (num1 > num2) {
                int whole = (num1 / num2);
                int quotient = num1 - num2;
                System.out.println(whole + " " + quotient + "/" + num2);
            } else if (num1 == num2) {
                System.out.println(1);
            } else {
                System.out.println("Подсчет не производится");
            }
        } else {
            System.out.println(num1 / num2);
        }
    }
}
