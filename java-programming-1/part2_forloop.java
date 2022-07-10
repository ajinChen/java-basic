public class part2_forloop {
    public static void main(String[] args) {
        
        /* For Loop */
        for (int i = 0; i < 10; i += 3) {
            System.out.println(i);
        }

        /* Sum of sequence */
        int sumNum = 1;
        for (int i = 1; i < 10; i++) {
            sumNum *= i;
        }
        System.out.println(sumNum);
    }
}
