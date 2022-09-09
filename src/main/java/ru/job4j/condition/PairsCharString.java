package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        /* Мой вариант*/
        if (l == "" && r == "" || l.charAt(0) == r.charAt(r.length() - 1) && r.charAt(0) == l.charAt(l.length() - 1)) {
            return true;
        }
        return false;
    }
}
/* Вариант CheckStyle
package ru.job4j.condition;

import java.util.Objects;

public class PairsCharString {
    public static boolean check(String l, String r) {
        return Objects.equals(l, "") && Objects.equals(r, "") || l.charAt(0) == r.charAt(r.length() - 1) && r.charAt(0) == l.charAt(l.length() - 1);
    }
}
 */