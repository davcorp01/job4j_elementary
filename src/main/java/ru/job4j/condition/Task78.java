package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 78. На какие числа из составляющих входящее число цифр оно делится без остатка
https://job4j.ru/profile/topics/13/task_code/354/158571
 */
import java.util.StringJoiner;
public class Task78 {
    public static void divWithoutRemainder(int num) {
        int first = num / 100;
        int middle = num / 10 % 10;
        int last = num % 10;
        StringJoiner joiner = new StringJoiner(" ");
        joiner.setEmptyValue("Таких чисел нет");
        if (first != 0 && num % first == 0) {
            joiner.add(String.valueOf(first));
        }
        if (middle != 0 && num % middle == 0) {
            joiner.add(String.valueOf(middle));
        }
        if (last != 0 && num % last == 0) {
            joiner.add(String.valueOf(last));
        }
        System.out.println(joiner);
        }
    }

