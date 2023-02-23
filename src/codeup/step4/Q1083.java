package codeup.step4;

import java.util.*;

public class Q1083 {
    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i=1; i<=input; i++) {
            if (i%3 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
