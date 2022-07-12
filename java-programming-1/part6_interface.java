import java.util.Scanner;

/* Interface and Abstract class
* Interface: Every single method declared in an Interface will have to be implemented in the subclass (general)
* Abstract Class: Include concrete detail of implement code
* Main Loop: For calling Interface of problem

* Order: Main Loop -> Interface -> Abstract class for subProblem
* See UserInterface.java and WordSet.java
*/

public class part6_interface {
    public static void main(String[] args) {
        // create variable for Interface
        Scanner scanner = new Scanner(System.in);
        WordSet set = new WordSet();

        // Start Interface
        UserInterface userInterface = new UserInterface(set, scanner);
        userInterface.start();
    }
}
