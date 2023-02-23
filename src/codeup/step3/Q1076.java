package codeup.step3;

import java.util.*;

public class Q1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        for (int i=97; i<(int)input; i++) {
            System.out.print((char)i + " ");
        }
        System.out.print(input);
    }
}
