// import list package
import java.util.ArrayList;

public class part3_list {
    public static void main(String[] args) {

        /* Create List (Type) */
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Double> doubList = new ArrayList<>();
        ArrayList<Boolean> boolList = new ArrayList<>();

        /* Add Value into List (Add value from bottom) */
        String first = "First";
        String second = "Second";
        strList.add(first);
        strList.add(second);

        /* Get value using position index (start from 0) */
        System.out.println(strList.get(0));
        System.out.println(strList.get(1));

        /* Iterate a Arraylist */
        // Get the list size
        int listSize = strList.size();

        // while loop
        int i = 0;
        while (i < strList.size()) {
            System.out.println(strList.get(i));
            i += 1;
        }

        // for loop
        for (int j = 0; j < strList.size(); j++) {
            System.out.println(strList.get(j));
        }

        // for-each loop
        for (String elem : strList) {
            System.out.println(elem);
        }

        /* Remove value in List */
        // depend on index
        int index = 1;
        strList.remove(index);
        // depend on same type value
        String trg = "First";
        strList.remove(trg);
        // remove int value using value (tricky)
        int trgVal = 15;
        intList.remove(Integer.valueOf(trgVal));

        /* Contain a Value */
        boolean found = strList.contains("First");
    }

    /* Pass Arraylist in method
     * 1. the method will change the original arrayList which pass inside
     * 2. reference-type variable will change in the method
     * 3. value-type variable is copied to a method and will not change
     */
    public static void printList(ArrayList<String> list) {
        for (String elem : list) {
            System.out.println(elem);
        }
    }
}
