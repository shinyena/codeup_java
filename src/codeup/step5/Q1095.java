package codeup.step5;

import java.util.*;

public class Q1095 {
    public static int[] sort(int[] arr, int size) {
        int tmp;
        for (int i=0; i<size; i++) {
            for (int j=i; j<size; j++) {
                if (arr[i]>arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            int input = scanner.nextInt();
            arr[i] = input;
        }
        int[] sortedArr = sort(arr, size);
        System.out.print(sortedArr[0]);
    }
}
