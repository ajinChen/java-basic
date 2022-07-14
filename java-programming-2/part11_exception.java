import java.io.File;
import java.util.Scanner;

public class part11_exception {
    public static void main(String[] args) {
        
        /* Try-Catch */
        try {
            // code block may occur error
            System.out.println("Hello");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

        /* Try-Resource 
         * Using in handing for operating system resource files
        */
        try (Scanner reader = new Scanner(new File("file.txt"))) {
            while (reader.hasNextLine()) {
                System.out.println("Has next line");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

        /* Throw Exception */
        // Method 1 inline
        int num = 10;
        if (num > 5) {
            throw new IllegalArgumentException("Message");
        } else {
            throw new NumberFormatException();
        }
    }

    // Method 2 on Method
    public void reaLine(String fileName) throws Exception {
        System.out.println(fileName);
    }
}
