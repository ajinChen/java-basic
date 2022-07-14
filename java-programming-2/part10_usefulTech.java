public class part10_usefulTech {
    public static void main(String[] args) {

        /* StringBuilder
         * Using StringBuilder is more efficient than creating strings with the + operator.
         * Only one string will built
         */
        StringBuilder strings = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            strings.append(i);
        }
        System.out.println(strings.toString());

        /* Regular Expressions 
         * 1. [], chars or numbers in range, like [0-9], [A-Z], [2-36-9]: 2-3 and 6-9
         * 2. |, or operation, like "00|11" ("00" or "11")
         * 3. (), specifies a part of string, like "000(0|1)"
         * 4. *, repeats 0-n times
         * 5. +, repeats 1-n times
         * 6. ?, repeats 0 or 1 times
         * 7. {a}, repeats a times
         * 8. {a, b}, repeats a to b times
         * 9. {a,}, repeats a to n times
        */
        String regex = "ab(ba)+";
        String word = "ab";
        if (word.matches(regex)) {
            System.out.println("Correct!");
        }

        /* Enumerated Type - Enum 
         * If we know the possible values ​​of a variable in advance, we can use a class of type enum, 
         i.e., enumerated type to represent the values.
         * See Suit.java and Color.java files
        */
        System.out.println(Color.GREEN.getCode());
        System.out.println(Color.GREEN == Color.BLUE);

        /* Iterator 
         * The Collection interface implement the Iterable interface, and they can also be iterated 
         * over with the help of an iterator - an object specifically designed to go through a particular 
         * type of object collection. 
         See Hand.java example
        */
    }
}
