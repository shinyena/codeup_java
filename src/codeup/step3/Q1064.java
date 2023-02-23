package codeup.step3;

import java.util.*;

public class Q1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.print(a>b ? (b>c ? c : b) : (a>c ? c : a));
    }
}
