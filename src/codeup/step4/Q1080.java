package codeup.step4;

import java.util.*;

public class Q1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;
        for (int i=1; i<=input; i++) {
            sum += i;
            if (sum>=input){
                System.out.print(i);
                break;
            }
        }
    }
}
