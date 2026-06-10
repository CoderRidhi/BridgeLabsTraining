import java.util.*;

public class FirstNegative {

    public static List<Integer> firstNegative(int[] arr, int k) {

        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            if (arr[i] < 0) {
                dq.offerLast(i); //used offerLast instead of addLast to avoid exception if the deque is full,
                //  but in this case it won't be full since we are only adding indices of negative numbers.
            }
            if (i >= k - 1) {

                if (dq.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(arr[dq.peekFirst()]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int arr[] = {-8, 2, 3, -6, 10};
        int k = 2;

        System.out.println(firstNegative(arr, k));
    }
}