import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;

public class part9_interface {

    public static void main(String[] args) {
        /* Interface
     * Interfaces is used to define behavior that's required from a class without actual implement, 
     i.e., its methods.
     * 1. A visibility attribute on interfaces is not marked explicitly as they're always public
     * 2. Interface also can be seem as Variable Type, Method Parameters and Return Parameter
     * 3. Using interfaces in programming enables reducing dependencies between classes.
     */

     // 1. Variable Type
     TextMessage message = new TextMessage("ope", "Something cool's about to happen");
     Readable readable = new TextMessage("ope", "The text message is Readable!");
     TextMessage castMessage = (TextMessage) readable;
     ArrayList<Readable> readingList = new ArrayList<>();

     // 2. Method Parameters
     //public void print(Readable readable) {
     //}

    // 3. Return Type
    //public readable print(Readable readable) {
    //   return new Readable();
    //}


     /* Build-In Interfaces
      * 1. List
      * 2. Map
      * 3. Set
      * 4. Collection
      * 5. Comparable<Type>
      */

    // 1. List Interface
    List<String> strs1 = new ArrayList<>();
    List<String> strs2 = new LinkedList<>();

    // 2. Map Interface
    Map<String, String> maps = new HashMap<>();

    // 3. Set Interface
    Set<String> set = new HashSet<>();

    // 4. Collection Interface
    // Both the List and Set interfaces implement the Collection interface. 
    // The Collection interface provides, for instance, methods for checking the existence of an item 
    // (the method contains) and determining the size of a collection (the method size).

    // 5. Comparable Interface
    // the Member class implements the Comparable interface, it is possible to sort the list by using 
    // the sorted method. (Member class)
    
    /* Implement multiple Interfaces
     * we can implement multiple interfaces but can only inheritance one superclass
     */
    // public class Person implements Comparable<Person>, List, Set {}

    }
}
