// with arrayDeque 
import java.util.*;
public class maxSlidingWindow {

    public static List<Integer> max(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        if (arr.length == 0) {
            return result;
        }
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(max(arr, k));
    }
}