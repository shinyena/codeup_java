package data_structure;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>(4);
        for (int i=0; i<4; i++) {
            arrayList.add(scanner.nextLine());
        }

        String max_str = arrayList.get(0);
        for (int i=1; i<4; i++) {
            if (max_str.length() < arrayList.get(i).length())
                max_str = arrayList.get(i);
        }
        System.out.println(max_str);

        Collections.sort(arrayList);
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
