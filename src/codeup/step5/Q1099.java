package codeup.step5;

import java.util.*;

public class Q1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int x = 1;
        int y = 1;
        while (arr[x][y] != 2) {
            arr[x][y] = 9;
            if (y+1<10 && arr[x][y+1] != 1) {
                y += 1;
            } else {
                if (x+1<10 && arr[x+1][y] != 1)
                    x += 1;
                else
                    break;
            }
        }
        if (arr[x][y] == 2)
            arr[x][y] = 9;
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
