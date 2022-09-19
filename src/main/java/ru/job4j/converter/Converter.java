package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2;
        float expectedUsd = 2.3333333F;
        float outEuro = Converter.rubleToEuro(in);
        float outUsd = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedUsd = expectedUsd == outUsd;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("140 rubles are 2.3333333. Test result : " + passedUsd);
    }
}