package codeup.step2;

import java.util.*;

public class Q1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (String s : input.split("")) {
            System.out.println("'" + s + "'");
        }
    }
}
