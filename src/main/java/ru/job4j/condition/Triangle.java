package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean abcabc = (ab + ac) > bc;
        boolean acbcab = (ac + bc) > ab;
        boolean abbcac = (ab + bc) > ac;

        return (abcabc && acbcab && abbcac);
    }
}
