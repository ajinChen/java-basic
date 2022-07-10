public class part3_string {
    public static void main(String[] args) {
        
        /* Split a String */
        String text = "first second third fourth";
        String[] pieces = text.split(" ");

        /* Get Character in String */
        char character = text.charAt(0);
        System.out.println(character);

        /* Length of String */
        int length = text.length();
    }
}
