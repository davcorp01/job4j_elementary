package ru.job4j.condition;

public class Task47 {
    public static void changeNum(int number) {
       int first = number / 100;
       int middle = number / 10 % 10;
       int last = number % 10;
       if (number > 500) {
           System.out.println(last * 100 + middle * 10 + first);
       } else {
           System.out.println(first * 100 + last * 10 + middle);
       }
    }
}
