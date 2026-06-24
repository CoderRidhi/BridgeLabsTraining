import java.util.Arrays;
import java.util.List;

public class MaximumFinder {

    public static <T extends Comparable<T>> T findMax(List<T> list) { 
        T max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 50, 20, 70, 30);

        System.out.println(findMax(numbers));

        List<Double> doubles =
                Arrays.asList(10.5, 25.8, 12.3, 99.9);

        System.out.println(findMax(doubles));

        List<String> names =
                Arrays.asList("vishakha", "ridhi", "diya");

        System.out.println(findMax(names));
    }
}