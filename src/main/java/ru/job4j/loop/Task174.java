package ru.job4j.loop;

import java.sql.SQLOutput;

public class Task174 {

    public static void isPalindrome(int number) {
        //int reverted = 0;
        //String s = String.valueOf(number);
        //int remainder = 0;
        int reverted = number % 10;
        int remainder = number / 10;
        for (int i = 0; reverted < remainder; i++) {
            reverted = remainder % 10;
            remainder = remainder / 10;
        }
        /*System.out.println(lastNumber);
        System.out.println(preLastnumber);*/

    }

}