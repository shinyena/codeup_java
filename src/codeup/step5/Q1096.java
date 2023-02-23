package codeup.step5;

import java.util.*;

public class Q1096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i=0; i<19; i++) {
            for (int j=0; j<19; j++) {
                arr[i][j] = 0;
            }
        }
        int size = scanner.nextInt();
        for (int i=0; i<size; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[a-1][b-1] = 1;
        }
        for (int i=0; i<19; i++) {
            for (int j=0; j<19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
