import java.util.*;

public class IntersectionAndUnion {

    public static void unionAndIntersectionSize(int[] A, int[] B) {

        HashSet<Integer> unionSet = new HashSet<>();

        for (int num : A) {
            unionSet.add(num);
        }

        for (int num : B) {
            unionSet.add(num);
        }

        HashSet<Integer> setA = new HashSet<>();

        for (int num : A) {
            setA.add(num);
        }

        HashSet<Integer> intersectionSet = new HashSet<>();

        for (int num : B) {
            if (setA.contains(num)) {
                intersectionSet.add(num);
            }
        }

        System.out.println("Union Size = " + unionSet.size());
        System.out.println("Intersection Size = " + intersectionSet.size());
    }

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        int[] B = {3, 4, 5, 6};

        unionAndIntersectionSize(A, B);
    }
}

/*Initial Approach - but it fails for this test case -
A = {1,1,2}
B = {1,2}
import java.util.*;
public class IntersectionAndUnion
{
	public static void main(String[] args) {
		
		int arr1[]  = {1,2,3,4};
		int arr2[]  = {3,4,5,6};
		
		int intersectionCount = 0;
		int unionCount = 0;
		
		for(int i=0;i<arr1.length;i++)
		{
		    for(int j=0;j<arr2.length;j++)
		    {
		        if(arr1[i]==arr2[j])
		        {
		            intersectionCount++;
		        }
		    }
		}
		System.out.println("Intersection count: "+intersectionCount);
		int size = arr1.length+arr2.length;
// 		System.out.println(size);
		unionCount = size-intersectionCount;
		System.out.println("Union Count: "+unionCount);
	}
}*/