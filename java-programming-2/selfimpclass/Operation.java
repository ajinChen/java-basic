package selfimpclass;
import java.util.Scanner;

// Abstract Class
public abstract class Operation {

    // Abstract Variable
    private String name;

    public Operation(String name) {
        this.name = name;
    }

    // Abstract Method
    public abstract void execute(Scanner scanner);
    
}