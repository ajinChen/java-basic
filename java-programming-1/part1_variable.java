public class part1_variable {
    public static void main(String[] args) {

        /* 4 Types of variables */
        String text = "contains text";
        int wholeNumber = 123;
        double floatingPoint = 3.1415926;
        boolean trueOrFalse = true;
        // String, int, double, boolean type of data

        System.out.println("Text variable: " + text);
        System.out.println("Integer cariable: " + wholeNumber);
        System.out.println("Floating-point variable: " + floatingPoint);
        System.out.println("Boolean: " + trueOrFalse);
        // can print with string directly

        /* Declared variables one time only */
        int val1 = 10;
        System.out.println(val1);
        val1 = 100;
        // the type of variable is declared at the first time and not need for second time assigned
        System.out.println(val1);

        /* Assign rules
         * 1. int can assign to a double (not info loss) as double type
         * 2. double can not assign to a integer (info loss)
         * 3. other type variables ca not change type for assigned
        */
        floatingPoint = 0.42;
        // can't assign type again if exist
        floatingPoint = 1;
        System.out.println(floatingPoint);

        /* Name variables rules
         * 1. start from lower character and upper case when other world: firstYearRate
         * 2. can not start from a number: 7year (don't work)
         */

        /* Convert string to other variables */
        // 1. string to integer
        String valueAsString1 = "42";
        int value = Integer.valueOf(valueAsString1);
        System.out.println(value);

        // 2. string to double
        String valueAsString2 = "42.42";
        double val2 = Double.valueOf(valueAsString2);
        System.out.println(val2);

        // 3. string to boolean
        String valueAsString3 = "TRUE";
        boolean val3 = Boolean.valueOf(valueAsString3);
        System.out.println(val3);
    }
}
