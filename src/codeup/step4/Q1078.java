package codeup.step4;

import java.util.*;

public class Q1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;
        for (int i=0; i<=input; i++) {
            if (i%2 == 0)
                sum += i;
        }
        System.out.print(sum);
    }
}
