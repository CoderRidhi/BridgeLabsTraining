import java.util.*;

public class UnsortedSubarray {
    public static void main(String[] args) {

        int[] arr1 = {2,6,4,8,10,9,15};

        int[] arr2 = arr1.clone();
        Arrays.sort(arr2);

        int firstDiffIndex = -1;
        int lastDiffIndex = -1;

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                firstDiffIndex = i;
                break;
            }
        }

        if(firstDiffIndex == -1) {
            System.out.println(0);
            return;
        }

        for(int i = arr1.length - 1; i >= 0; i--) {
            if(arr1[i] != arr2[i]) {
                lastDiffIndex = i;
                break;
            }
        }

        int length = lastDiffIndex - firstDiffIndex + 1;

        System.out.println(length);
    }
}