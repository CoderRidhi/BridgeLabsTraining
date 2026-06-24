import java.util.HashSet;

public class LongestUniqueSubarray {

    public static int longestUnique(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                left++;
            }

            set.add(nums[right]);

            maxLength = Math.max(
                    maxLength,
                    right - left + 1
            );
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 4, 5, 6};

        System.out.println(
                longestUnique(nums)
        );
    }
}