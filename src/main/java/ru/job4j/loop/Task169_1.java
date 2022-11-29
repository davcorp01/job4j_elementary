package ru.job4j.loop;

import javax.swing.*;

public class Task169_1 {
    public static void paint(int columnCount) {
        String star = "*";
        String space = " ";
        int dotX = (columnCount + 1);
        for (int r = 1; r <= columnCount; r++) {
            if (r == 1 || r == columnCount) {
                for (int j = 1; j <= columnCount; j++) {
                    System.out.print(star);
                }
                if (r != columnCount) {
                    System.out.println();
                }
            }
            if (r != 1 && r != columnCount) {
                System.out.print(space);
                for (int c = 2; c < columnCount; c++) {
                    if (c == 1 || c == columnCount) {

                        continue;
                    }
                    if (r == c && dotX / 2 > c) {
                        System.out.print(star);
                        continue;
                    }
                    if (dotX == c + r && dotX / 2 > c) {
                        System.out.print(star);
                        continue;
                    }
                    if (dotX == c + r) {
                        System.out.print(star);
                        break;
                    }
                    if (r == c && dotX / 2 < c) {
                        System.out.print(star);
                        break;
                    }
                    if (r != c || dotX != c) {
                        System.out.print(space);

                    }

                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        paint(9);
        System.out.println();
        paint(8);
        System.out.println();

    }
}

