public class part3_array {
    public static void main(String[] args) {
        
        /* Create a Array (need specify a size) */
        int[] numbers = new int[3];
        int[] nums = {100, 1, 200};
        double[] floatings = new double[4];
        double[] doubs = {0.1, 0.44};
        String[] strings = new String[5];
        String[] strs = {"Hi There", "Not Way"};

        /* Assign value */
        numbers[0] = 42;
        numbers[2] = 21;
        strings[2] = "Third";

        /* Get the Length */
        int arrayLength = numbers.length;
    }

    // Pass Array for a Method
    public static void listElem(int[] integerArray) {
        int idx = 0;
        while (idx < integerArray.length) {
            System.out.println(integerArray[idx]);
            idx += 1;
        }
    }
}
