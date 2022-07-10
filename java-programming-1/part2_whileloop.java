import java.util.Scanner;

public class part2_whileloop {
    public static void main(String[] args) {

        /* While Loop, use break to stop the loop */
        int num = 1;
        while (true) {
            System.out.println(num);
            if (num >= 5) {
                break;
            }

            num = num + 1;
        }
        System.out.println("Ready!");

        /* While Loop, use continue to skip below and return beginning */
        while (true) {
            num = num + 1;
            if (num >= 5) {
                break;
            } else {
                System.out.println(num + " ");
                continue;
            } 
        }
        
        /* AVG of input number */
        Scanner reader = new Scanner(System.in);
        double sumOfNum = 0.0;
        int count = 0;

        while (true) {
            System.out.println("Enter a number: ");
            double num1 = Double.valueOf(reader.nextLine());

            if (num1 == 0) {
                System.out.println(sumOfNum / count);
                break;
            } else {
                sumOfNum = sumOfNum + num1;
                count++;
            }
        }

        /* While Loop with condition */
        int number = 0;
        int step = 2;
        while (number < 6) {
            System.out.println(number);
            number += step;
        } 
    }
}