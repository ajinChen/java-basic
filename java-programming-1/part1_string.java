// import package
import java.util.Scanner;

public class part1_string {
    public static void main(String[] args) {
        /* Read String from input */
        // 1. create a tool for reading user input and name it scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a message: ");
        // 2. wait for user to get the data and assign it as string
        // Type variable_name = data
        String message = reader.nextLine();
        // 3. print message writing by user
        System.out.println(message);

        /* Concatenation String */
        String start = "Jih";
        String end = "Chen";
        System.out.println(start + "-Chin " + end);
        
    }
    
}
