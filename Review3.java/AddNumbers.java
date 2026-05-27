import java.util.LinkedList;

public class AddNumbers {

    public static LinkedList<Integer> addTwoNumbers(
            LinkedList<Integer> l1,
            LinkedList<Integer> l2) {

        LinkedList<Integer> result =
                new LinkedList<>();

        int i = 0;
        int carry = 0;

        while (i < l1.size()
                || i < l2.size()
                || carry != 0) {

            int sum = carry;

            if (i < l1.size()) {

                sum = sum + l1.get(i);
            }

            if (i < l2.size()) {

                sum = sum + l2.get(i);
            }

            int digit = sum % 10;

            carry = sum / 10;

            result.add(digit);

            i++;
        }

        return result;
    }

    public static void printList(
            LinkedList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i));

            if (i != list.size() - 1) {

                System.out.print(" -> ");
            }
        }

        System.out.println();
    }
    public static void main(String[] args) {


        LinkedList<Integer> l1 =
                new LinkedList<>();

        l1.add(2);
        l1.add(4);
        l1.add(3);


        LinkedList<Integer> l2 =
                new LinkedList<>();

        l2.add(5);
        l2.add(6);
        l2.add(4);

        System.out.println("First Number:");
        printList(l1);

        System.out.println("Second Number:");
        printList(l2);

        // Add numbers
        LinkedList<Integer> result =
                addTwoNumbers(l1, l2);

        System.out.println("Result:");
        printList(result);
    }
}