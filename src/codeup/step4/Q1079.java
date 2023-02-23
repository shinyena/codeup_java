package codeup.step4;

import java.util.*;

public class Q1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        while (input != "q".charAt(0) ) {
            System.out.println(input);
            input = scanner.next().charAt(0);
        }
        System.out.println(input);
    }
}
