import java.util.Scanner;
import java.util.List;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class part10_stream {
    public static void main(String[] args) {
        /* Stream
         * Stream is a way of going through a collection of data such that the programmer 
         determines the operation to be performed on each value. No record is kept of the 
         index or the variable being processed at any given time.
         * Stream can be formed from any object that implement the Collection interface using stream() method
         */

        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }

        // counting the number of values divisible by three using stream
        long numbersDivisibleByThree = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(num -> num % 3 == 0)
            .count();

        // working out the average
        double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();

        // printing out the statistics
        System.out.println("Divisible by three " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);

        /* Lambda Function */
        // lambda function (->)
        inputs.stream().filter(value -> Integer.valueOf(value) > 5).count();
        // passing method with lambda
        inputs.stream().filter(value -> Screeners.greaterThanFive(value)).count();
        // passing method
        inputs.stream().filter(Screeners::greaterThanFive).count();

        /* Stream Method
         * 1. intermediate operations: intend for processing elements
         * 2. terminal operations: end of processing elements
         */


         /* intermediate operations 
          * 1. filter, filter(value -> filter condition)
          * 2. mapToInt, mapToInt(value -> another)
          * 3. map, map(value -> another), apply on every elements
          * 4. distinct, distinct() to get unique value
          * 5. sorted, sorted() to sort the value
         */


         /* terminal operations 
          * 1. average()
          * 2. count()
          * 3. collect(Collectors.toCollection(ArrayList::new)), create new ArrayList to collect values
          * 4. forEach(value -> System.out.println(value));
          * 5. reduce, reduce(initialState, (previous, object) -> actions on the object)
          i.e. reduce(0, (prevSum, val) -> prevSum + val);
         */

        /* Files and Streams */
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("file.txt")).forEach(row -> rows.add(row));
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }

        /* Sort with Lambda Function (without comparable interface)*/
        ArrayList<Member> members = new ArrayList<>();

        // Method 1 (stream compare)
        members.stream().sorted((m1, m2) -> {
            return m1.getHeight() - m2.getHeight();
        }).forEach(m -> System.out.println(m.getName()));

        // Method 2 (collection compare)
        Collections.sort(members, (m1, m2) -> m1.getHeight() - m2.getHeight());
        members.stream().forEach(m -> System.out.println(m.getName()));

        // Method 3 (multiple compare)
        Comparator<Member> comparator = Comparator.comparing(Member::getHeight).thenComparing(Member:: getName);
        Collections.sort(members, comparator);

    }
}
