package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return (notEven(num) && isPositive(num));
    }

    public static boolean evenOrNotPositive(int num) {
        return (isEven(num) || notPositive(num));
    }

    public static void main(String[] args) {
        int num = 2;
        boolean results;
        results = LogicNot.isEven(num);
        System.out.println("Четное (isEven) " + num + " = " + results);
        results = LogicNot.isPositive(num);
        System.out.println("Положительное (isPositive) " + num + " = " + results);
        results = LogicNot.notEven(num);
        System.out.println("Не четное (notEven) " + num + " = " + results);
        results = LogicNot.notPositive(num);
        System.out.println("Не положительное (notPositive) " + num + " = " + results);
        results = LogicNot.notEvenAndPositive(num);
        System.out.println("Не четное и положительное (notEvenAndPositive) " + num + " = " + results);
        results = LogicNot.evenOrNotPositive(num);
        System.out.println("Четное ИЛИ не положительное (evenOrNotPositive) " + num + " = " + results);
    }
}