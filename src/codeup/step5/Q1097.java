package codeup.step5;

import java.util.*;

public class Q1097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i=0; i<19; i++) {
            for (int j=0; j<19; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int size = scanner.nextInt();
        for (int k=0; k<size; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int i=0; i<19; i++) {
                for (int j=0; j<19; j++) {
                    if (i==x-1) {
                        arr[i][j] = arr[i][j] == 0 ? 1 : 0;
                    }
                    if (j==y-1) {
                        arr[i][j] = arr[i][j] == 0 ? 1 : 0;
                    }
                }
            }
        }
        for (int i=0; i<19; i++) {
            for (int j=0; j<19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
