import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class part7_sort {
    public static void main(String[] args) {
        
        /* sort in Array (using Arrays) */
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        /* sort in List (using Collections) */
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(8);
        nums.add(3);
        nums.add(7);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
    }
}
