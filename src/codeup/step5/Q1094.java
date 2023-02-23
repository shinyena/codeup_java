package codeup.step5;

import java.util.*;

public class Q1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            int input = scanner.nextInt();
            arr[i] = input;
        }
        for (int i=size-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
