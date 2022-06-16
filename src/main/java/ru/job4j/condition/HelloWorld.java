package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        boolean three = number % 3 == 0;
        boolean five = number % 5 == 0;
        if (three && !five) {
            return "Hello";
        } else if (!three && five) {
            return "World";
        } else if (three && five) {
            return "Hello, World!!!";
    }
        return "Operation not support";
    }
}
