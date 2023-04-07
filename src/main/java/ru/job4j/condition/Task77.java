package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 77. Количество разных цифр в трехзначном числе
https://job4j.ru/profile/topics/13/task_code/353/158568
 */

public class Task77 {
    public static void diffNumAmount(int num) {
        int first = num / 100;
        int middle = num / 10 % 10;
        int last = num % 10;
        if (first != middle && first != last && middle != last) {
            System.out.println(3);
        } else if (first == middle && first != last) {
            System.out.println(2);
        } else if (first != middle && first == last) {
            System.out.println(2);
        } else if (first != middle && middle == last) {
        System.out.println(2);
        } else if (first == middle && first == last && middle == last) {
            System.out.println(0);
        }
    }
}
