package ru.job4j.condition;

public class Task40 {
    public static void isDoubleEven(int number) {
        int first = number / 100;
        int middle = (number / 10) % 10;
        int last = number % 10;
        if (number % 2 + (first + middle + last) % 2 == 0) {
        /*if ((first + middle + last + number) % 2 == 0) {
        if (number % 2 == 0) {
        if (number % 2 == 0 && (first + middle + last) % 2 == 0) {

        if (number % 2 == 0 && (first + middle + last) % 2 == 0) {*/
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
//}
