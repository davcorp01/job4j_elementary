package ru.job4j.loop;

public class Task169 {
    public static void paint(int columnCount) {
        String star = "*";
        String space = " ";
        for (int i = 1; i <= columnCount; i++) {
            if (i == 1 || i == columnCount) {
                for (int j = 1; j <= columnCount; j++) {
                    System.out.print(star);
                }
                System.out.println();
            }
            if (i != 1 || i != columnCount) {
                for (int j = 1; j <= columnCount; j++) {
                    System.out.print(space);
                }
                System.out.println();
            }
        }
    }


/*if ()
        for (int row = 0; row < columnCount; row++) {
            for (int cell = 0; cell < columnCount; cell++) {
                if ((row + cell) % 2 == 0) {
                    System.out.print(star);
                } else {
                    System.out.print(space);
                }
            }
            System.out.println();
        }
    }*/

    public static void main(String[] args) {
        paint(3);
        System.out.println();
        paint(4);
    }
}

