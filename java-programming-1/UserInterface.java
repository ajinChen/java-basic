import java.util.Scanner;

/* Interface class
 * Only include the general implement of problem, not detailed code
 */

public class UserInterface {
    // object variable (subclass)
    private WordSet wordSet;
    private Scanner scanner;

    // Interface Constructor
    public UserInterface(WordSet wordSet, Scanner scanner) {
        this.wordSet = wordSet;
        this.scanner = scanner;
    }

    // Start Block for problem (only exist in Interface class)
    public void start() {
        
        while (true) {
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();

            if (this.wordSet.contains(word)) {
                break;
            }

            this.wordSet.add(word);
        }

        System.out.println("You gave the same word twice");
    }
}
