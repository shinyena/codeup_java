package codeup.step5;

import java.util.*;

public class Q1098 {
    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int[][] arr = new int[w+1][h+1];
        int n = scanner.nextInt();
        for (int i=0; i<n; i++) {
            int l = scanner.nextInt();
            int d = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j=0; j<l; j++) {
                if (d==1 && x+j<=w)
                    arr[x+j][y] = 1;
                if (d==0 && y+j<=h)
                    arr[x][y+j] = 1;
            }
        }
        for (int i=1; i<=w; i++) {
            for (int j=1; j<=h; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
