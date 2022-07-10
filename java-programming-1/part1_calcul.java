public class part1_calcul {
    public static void main(String[] args) {
        /* Operations
         * 1. +
         * 2. -
         * 3. *
         * 4. /, division, 5 / 2 = 2
         * 5. %, modulo, 5 % 2 = 1
         * 6. ()
         */

         /* Tricky in Division */
        System.out.println(3 / 2);
        // if both numbers are int, result is also int (1)
        System.out.println(3.0 / 2);
        System.out.println(3 / 2.0);
        //if one of number is double, the result is double (1.5)

        /* Type-Casting (Convert numerical type) */
        int first = 3;
        int second = 2;
        System.out.println((double)first / second); // print 1.5
        System.out.println((double)(first / second)); // print 1.0

        // Time floating point convert to double
        System.out.println(1.0 * first / second); // print 1.5


        
    }
}
