package ru.job4j.loop;

import javax.swing.*;

public class Task169_1 {
    public static void paint(int columnCount) {
        String star = "*";
        String space = " ";
        int dotX = (columnCount + 1); //колво колонок +1
        for (int r = 1; r <= columnCount; r++) { //перебор строк
            if (r == 1 || r == columnCount) { //если строка первая или последняя то иксы
                for (int j = 1; j <= columnCount; j++) {
                    System.out.print(star);
                }
                if (r != columnCount) {
                    System.out.println();
                }
            }
            if (r != 1 && r != columnCount) { // перебор колонок
                System.out.print(space);
                for (int c = 2; c < columnCount; c++) {
                    if (r == c) {
                        System.out.print(star);
                        if (dotX / 2 == r && dotX / 2 == c) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    if (dotX - r == c) {
                        System.out.print(star);
                        if (dotX / 2 > r) {
                            break;
                        } else {
                            continue;
                        }
                    }
                        System.out.print(space);
                    }
                    System.out.println();
                }
            }
        }

    public static void main(String[] args) {
        paint(5);
        System.out.println();
        paint(8);
        System.out.println();
        paint(3);
        System.out.println();
    }
}

