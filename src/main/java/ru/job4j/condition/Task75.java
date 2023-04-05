package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 76. Количество повторений "внутреннего" числа
https://job4j.ru/profile/topics/13/task_code/351/158462
 */
public class Task75 {
    public static  void innerNum(int num2, int num4) {
        int first = num4 / 100;
        int middle = num4 / 10 % 100;
        int last = num4 % 100;
        int count = 0;
        count = first == num2 ? count + 1 : count;
        count = middle == num2 ? count + 1 : count;
        count = last == num2 ? count + 1 : count;
        System.out.println(count);
    }
}
