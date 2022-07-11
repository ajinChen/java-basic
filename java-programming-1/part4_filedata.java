import java.util.Scanner;
import java.nio.file.Paths;

public class part4_filedata {
    public static void main(String[] args) {
        
        /* Interact with Terminal (System.in) */
        Scanner reader = new Scanner(System.in);
        while (true) {
            String line = reader.nextLine();
            if (line.isEmpty()) {
                break;
            } else {
                System.out.println(line);
            }
        }

        /* Read a File in filesystem */
        try (Scanner filereader = new Scanner(Paths.get("data.txt"))) {
            while (filereader.hasNextLine()) {
                String line = filereader.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

    }
}
