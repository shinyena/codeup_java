package codeup.step2;

import java.util.*;

public class Q1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String[] inputs = String.valueOf(input).split("");
        for (int i = 0; i<inputs.length; i++) {
            inputs[i] = String.valueOf(Integer.parseInt(inputs[i])*(int)Math.pow(10, inputs.length - i - 1));
        }
        for (String s : inputs) {
            System.out.println("[" + s + "]");
        }
    }
}
