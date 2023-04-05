package ru.job4j.condition;

public class Task77 {
    public static void diffNumAmount(int num) {
        int first = num / 100;
        int middle = num / 10 % 10;
        int last = num % 10;
        int count = 0;
        count = first == middle && first == last ? count + 1 : count;
        count = first == middle && first != last ? count + 1 : count;
        System.out.println(count);
    }
}
