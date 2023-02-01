package ru.job4j.condition;

public class Task26 {
    public static void isEqual(int num1, int num2) {
        String lable = num1 == num2 ? "Да" : "Нет";
        System.out.println(lable);

        /*if(num1 == num2) {
            System.out.println("Да");
        } else  {
            System.out.println("Нет");
        }*/
    }
}