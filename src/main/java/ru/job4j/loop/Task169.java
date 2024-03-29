package ru.job4j.loop;

public class Task169 {
    public static void paint(int columnCount) {
        String star = "*"; String space = " "; float dotX = (columnCount + 1);
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
                int countStar = 0;
                for (int c = 2; c < columnCount; c++) {
                    if (r == c) {
                        System.out.print(star); countStar++;
                        if (dotX / 2 == r && dotX / 2 == c) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    if (dotX - r == c) {
                        System.out.print(star); countStar++;
                        if (dotX / 2 > r) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    if (countStar == 2) {
                        break;
                    }
                    System.out.print(space);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        paint(6);
        System.out.println();
        paint(9);
        System.out.println();
        paint(3);
        System.out.println();
    }
}
