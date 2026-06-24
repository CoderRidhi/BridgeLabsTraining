import java.util.*;

public class Main {

    public static int countBalancedSubarrays(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        map.put(0, 1);

        for (int num : nums) {

            if (num % 2 == 0) {
                prefixSum += 1;  
            } else {
                prefixSum -= 1;
            }

            count += map.getOrDefault(prefixSum, 0);

            map.put(prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3};

        System.out.println(countBalancedSubarrays(nums));
    }
}