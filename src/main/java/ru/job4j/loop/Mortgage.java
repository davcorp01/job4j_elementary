package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        amount = amount * (percent / 100 + 1);
        while (amount >= 0) {
           amount = (amount - salary) * (percent / 100 + 1);
           year++;
        }
        return year;
    }
}