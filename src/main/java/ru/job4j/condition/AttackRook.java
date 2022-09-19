package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        char left0 = left.charAt(0);
        char left1 = left.charAt(1);
        char right0 = right.charAt(0);
        char right1 = right.charAt(1);
        return left0 == right0 || left1 == right1;
    }
}
