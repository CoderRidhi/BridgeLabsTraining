//without using deque
import java.util.*;

public class maxSlidingWindow2 {

    public static List<Integer> maxSlidingWindow(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= nums.length - k; i++) {

            int max = nums[i];

            for (int j = i; j < i + k; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }

            result.add(max);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        System.out.println(maxSlidingWindow(nums, k));
    }
}
