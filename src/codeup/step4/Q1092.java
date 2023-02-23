package codeup.step4;

import java.util.*;

public class Q1092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int day = 1;
        while (true) {
            if (day%a == 0 && day%b == 0 && day%c == 0) {
                System.out.print(day);
                break;
            }
            day += 1;
        }
    }
}
