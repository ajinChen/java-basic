import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import selfimpclass.Book;

public class part8_hashmap {
    public static void main(String[] args) {
        /* HashMap */
        // Create hashmap
        HashMap<String, String> postalCodes = new HashMap<>();
        HashMap<String, Book> bookList = new HashMap<>();
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();

        // Put key-value pairs
        postalCodes.put("00710", "Helsinki");
        postalCodes.put("90014", "Oulu");
        bookList.put("bookname", new Book("random", 1998, "Don't knoe"));

        // Get the value
        String value = postalCodes.get("00710");
        System.out.println(value);

        String value1 = postalCodes.getOrDefault("00710", "Default");
        System.out.println(value1);

        // Get the Time
        long start = System.nanoTime();

        // Contains
        boolean isContainKey = postalCodes.containsKey("00710");
        boolean isContainVal = postalCodes.containsValue("Oulu");

        // Remove
        postalCodes.remove("00710");

        // Get all the keys
        for (String code : postalCodes.keySet()) {
            continue;
        } 

        // Get all the values
        for (String val : postalCodes.values()) {
            continue;
        }

    }
}