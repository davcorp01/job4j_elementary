package ru.job4j.first;
/*
Job4j Упражнения 1.1.1. Вывод информации на консоль 18. Простые геометрические вычисления
https://job4j.ru/profile/topics/1/task_code/252/157977
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        double perimeter = a * 4;
        double longRound = Math.round(2 * Math.PI * r * 10.0) / 10.0;
        double areaCircle = Math.round(Math.PI * Math.pow(r, 2) * 10.0) / 10.0;
        System.out.println(perimeter); // периметр квадрата
        System.out.println(longRound); // длина окружности
        System.out.println(areaCircle); // длина окружности

    }
}