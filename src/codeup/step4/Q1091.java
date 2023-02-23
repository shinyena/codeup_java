package codeup.step4;

import java.util.*;

public class Q1091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long m = scanner.nextLong();
        long d = scanner.nextLong();
        long n = scanner.nextLong();
        long answer = a;
        for (int i=0; i<n-1; i++) {
            answer = answer*m + d;
        }
        System.out.print(answer);
    }
}
