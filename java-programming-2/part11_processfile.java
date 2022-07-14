import java.io.PrintWriter;

public class part11_processfile {
    public static void main(String[] args) throws Exception{

        /* Write file */
        PrintWriter writer = new PrintWriter("file.txt");
        writer.println("Hello file!");
        writer.print("Add extra");
        writer.close();
    }
}
