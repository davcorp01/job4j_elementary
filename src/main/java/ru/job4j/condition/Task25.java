package ru.job4j.condition;

public class Task25 {
    public static void isPositive(int number) {
        String lable = number > 0 ? "Да" : "Нет";
        System.out.println(lable);

        /*if(number > 0) {
            System.out.println("Да");
        } else  {
            System.out.println("Нет");
        }*/
    }
}
