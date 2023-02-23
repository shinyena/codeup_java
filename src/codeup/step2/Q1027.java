package codeup.step2;

import java.util.*;

public class Q1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split("\\.");
        System.out.println(inputs[2]+"-"+inputs[1]+"-"+inputs[0]);
    }
}
