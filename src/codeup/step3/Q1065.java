package codeup.step3;

import java.util.*;

public class Q1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<3; i++) {
            int input = scanner.nextInt();
            if (input%2 == 0)
                System.out.println(input);
        }
    }
}
