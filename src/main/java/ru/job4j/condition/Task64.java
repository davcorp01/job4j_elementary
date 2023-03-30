package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 64. Вывести текстовую форму оценки
https://job4j.ru/profile/topics/13/task_code/340/157845
 */
public class Task64 {
    public static void gradePrint(int number) {
        String mark;
        switch (number) {
            case 5 :
                mark = "Отлично"; break;
            case 4 :
                mark = "Хорошо"; break;
            case 3 :
                mark = "Удовлетворительно"; break;
            case 2  :
                mark = "Плохо"; break;
            case 1 :
                mark = "Плохо"; break;
            default:
                mark = "Не соответствует";
        }
        System.out.println(mark);
    }
}
