public class part1_conditional {
    public static void main(String[] args) {
        /* if & else if & else conditional statement */
        int num = 55;

        if (num == 1) {
            System.out.println("The num is one");
        } else if (num == 2) {
            System.out.println("The num is two");
        } else if (num == 3) {
            System.out.println("The num is three");
        } else {
            System.out.println("Something else!");
        }

        /* Operations for comparing (int, double, boolean)
         * >=, <=, >, <, ==, !=
         */

        /* Operations for comparing (string) 
         * 1. str1.equals(str2) -> compare if the same string
        */

        /* Logical Operators
         * 1. && -> and
         * 2. || -> or
         * 3. ! -> not
         */
        if (num < 0 || num > 100) {
            System.out.println("It is! :)");
        } else {
            System.out.println("It is not :(");
        }

        


    }
}
