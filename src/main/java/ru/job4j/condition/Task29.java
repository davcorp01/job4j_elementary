package ru.job4j.condition;

public class Task29 {
    public static void triangleCheck(double side1, double side2, double hypotenuse) {
        if (Math.pow(hypotenuse, 2) == (Math.pow(side1, 2) + Math.pow(side2, 2))) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
