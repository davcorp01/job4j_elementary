package ru.job4j.condition;

public class Task49 {
    @SuppressWarnings("checkstyle:RightCurly")
    public static void isPalindrome(int number) {
        String s = String.valueOf(number);
        int iLen = s.length();
        boolean result = true;
        for (int i = 0; i < (iLen / 2); i++) {
            if (s.charAt(i) != s.charAt(iLen - 1 - i)) {
                result = false;
                break;
                }
            }
        if (result) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}