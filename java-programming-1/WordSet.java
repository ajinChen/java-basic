import java.util.ArrayList;

/* Abstract Class
 * Include the detailed code to implement the behavior
 */

public class WordSet {
    // object variables
    private ArrayList<String> words;

    // Constructor
    public WordSet() {
        this.words = new ArrayList<>();
    }

    // Methods
    public void add(String word) {
        this.words.add(word);
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }
}
