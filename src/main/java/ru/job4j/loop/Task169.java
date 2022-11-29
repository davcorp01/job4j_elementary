package ru.job4j.loop;

import javax.swing.*;

public class Task169 {
    public static void paint(int columnCount) {
        String star = "*";
        String space = " ";
        int dotX = (columnCount + 1);
        for (int i = 1; i <= columnCount; i++) {
            if (i == 1 || i == columnCount) {
                for (int j = 1; j <= columnCount; j++) {
                    System.out.print(star);
                }
                if (i != columnCount) {
                    System.out.println();
                }
            }
            if (i != 1 && i != columnCount) {
                for (int rowCount = 1; rowCount <= columnCount; rowCount++) {
                    if (rowCount == 1 || rowCount == columnCount) {
                        System.out.print(space);
                        continue;
                    }
                    if (i == rowCount && dotX / 2 > rowCount) {
                        System.out.print(star);
                        continue;
                    }
                    if (dotX == rowCount + i && dotX / 2 > rowCount) {
                        System.out.print(star);
                        continue;
                    }
                    if (dotX == rowCount + i) {
                        System.out.print(star);
                        break;
                    }
                    if (i == rowCount && dotX / 2 < rowCount) {
                        System.out.print(star);
                        break;
                    }
                    if (i != rowCount || dotX != rowCount) {
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

