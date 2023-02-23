public class HashTable {
    private static int HASH_TABLE_CAPACITY = 1000;
    private Item[] data = new Item[HASH_TABLE_CAPACITY];
    private int size = 0;

    private int getHash(String key) {
        int hash  = 0;
        for (int i=0; i<key.length(); i++) {
            char val = key.charAt(i);
            hash = (hash + val*(i+1)) % HASH_TABLE_CAPACITY;
        }
        return hash;
    }

    public Object get(String key) {
        if (key != null) {
            int hash = getHash(key);
            while (data[hash] != null && !data[hash].key.equals(key)) {
                hash = (hash + 1) % HASH_TABLE_CAPACITY;
            }
            return data[hash] != null ? data[hash].value : null;
        }
        return null;
    }

    public void put(String key, Object value) {
        if (key != null) {
            int hash = getHash(key);
            while (data[hash] != null && !data[hash].key.equals(key)) {
                hash = (hash+1)% HASH_TABLE_CAPACITY;
            }
            data[hash] = new Item(key, value);
            size++;
        }
    }

    public Object remove(String key) {
        Object removed = 0;
        if (key != null) {
            int hash = getHash(key);
            while (data[hash] != null && !data[hash].key.equals(key)) {
                hash = (hash + 1) % HASH_TABLE_CAPACITY;
            }
            if (data[hash] != null) {
                removed = data[hash];
                data[hash] = null;
                size--;
            }
        }
        return removed;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String out = "HashTable: ";
        for (int i=0; i<data.length; i++) {
            Item item = data[i];
            if (item != null) {
                out += " Key(hash, index) : " + data[i].key + "(" + getHash(data[i].key) + "," + i + ")";
                out += " Value: " + data[i].value + "\n";
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println("hello world");

        HashTable hashTable = new HashTable();

        hashTable.put("Tokyo", "Japan");
        hashTable.put("Seoul", "Korea");
        hashTable.put("Beijing", "China");
        hashTable.put("Paris", "France");
        hashTable.put("Washington", "USA");
        hashTable.put("Brazilia", "Brazil");
        System.out.println();
//        System.out.println("hashTable.getHash(\"Tokyo\") = " + hashTable.getHash("Tokyo"));
//        System.out.println("hashTable.getHash(\"Seoul\") = " + hashTable.getHash("Seoul"));
//        System.out.println("hashTable.getHash(\"Beijing\") = " + hashTable.getHash("Beijing"));
//        System.out.println("hashTable.getHash(\"Paris\") = " + hashTable.getHash("Paris"));
//        System.out.println("hashTable.getHash(\"Brazilia\") = " + hashTable.getHash("Brazilia"));
        System.out.println();
        System.out.println("hashTable.get(\"Tokyo\") = " + hashTable.get("Tokyo"));
        System.out.println("hashTable.get(\"Seoul\") = " + hashTable.get("Seoul"));
        System.out.println("hashTable.get(\"Beijing\") = " + hashTable.get("Beijing"));
        System.out.println("hashTable.get(\"Paris\") = " + hashTable.get("Paris"));
        System.out.println("hashTable.get(\"Brazilia\") = " + hashTable.get("Brazilia"));
        System.out.println();
        System.out.println("Size: " + hashTable.size());
    }
}
