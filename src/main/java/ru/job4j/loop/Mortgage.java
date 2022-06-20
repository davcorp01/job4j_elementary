package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double duty = amount * (percent / 100 + 1);
        while (duty >= salary) {
            duty = (duty - salary) * (percent / 100 + 1);
           year++;
        }
        return year;
    }
}