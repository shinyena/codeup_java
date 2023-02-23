package codeup.step2;

import java.util.*;

public class Q1019 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] dates = input.split("\\.");
//        System.out.println(Arrays.toString(dates));
        System.out.printf("%04d.%02d.%02d",Integer.parseInt(dates[0]), Integer.parseInt(dates[1]), Integer.parseInt(dates[2]));
    }
}
