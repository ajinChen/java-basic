import selfimpclass.Locker;
import selfimpclass.Pair;

public class part12_generics {
    public static void main(String[] args) {
        
        /* Generic Class
         * pass the type like Map and List
         * add <> as type into method
         See Locker.java, Pair.java
        */
        Locker<Integer> integer = new Locker<>();
        Pair<Integer, String> pair = new Pair<>(1, "value");

        /* Generic Interface 
         * See SelfList.java and MovieList.java
        */

    }
}
