package codeup.step4;

import java.util.*;

public class Q1090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long r = scanner.nextLong();
        long n = scanner.nextLong();
        long answer = a;
        for (int i=0; i<n-1; i++) {
            answer = answer * r;
        }
        System.out.print(answer);
    }
}
