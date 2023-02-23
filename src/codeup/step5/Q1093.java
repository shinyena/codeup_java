package codeup.step5;

import java.util.*;

public class Q1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[] arr = new int[23];
        for (int i=0; i<23; i++) {
            arr[i] = 0;
        }
        for (int i=0; i<cnt; i++) {
            int input = scanner.nextInt();
            arr[input-1] += 1;
        }
        for (int i=0; i<23; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
