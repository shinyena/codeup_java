package data_structure;

import java.util.*;

public class HashMapEx1 {
    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> dict = new HashMap<>();
        dict.put("yena","예나");
        dict.put("papa","파파");
        dict.put("coni","코니");
        dict.put("youngjoo","영주");

        String input = scanner.nextLine();
        while (!input.equals("exit")) {
            if (dict.get(input) == null)
                System.out.println("없눈뒈여");
            else
                System.out.println(dict.get(input));
            input = scanner.nextLine();
        }
    }
}
