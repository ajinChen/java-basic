import java.util.Scanner;

/* Method
 * 1. Name Method same as variable: greetHelloWorld
 * 2. Method define: (public/private) + (static) + return_type + method_name (type para1, type para2)
 */

public class part2_method {
    public static void main(String[] args) {
        int width = 4;
        int height = 5;
        // call method
        rectangle(width, height);
    }

    /* Custom Method with variables */
    public static void rectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            recLine(width);
        }
    }

    public static void recLine(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
            // print string without /n at end
        }
        System.out.println("");
    }

    /* Method Return Type
     * 1. void -> no return value
     * 2. int -> return int type
     * 3. double -> return double type
     * 4. String -> return string type
     */

}
