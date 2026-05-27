import java.util.*;
public class AscendingOrder
{
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = read.nextInt();
		}
		for(int i=0;i<n;i++)
	    {
	       for(int j=i+1;j<n;j++)
	       {
	           if(arr[i]>arr[j])
	           {
	               int temp = arr[i];
	               arr[i]=arr[j];
	               arr[j]=temp;
	           }
	           
	       }
	       System.out.print(arr[i]+" ");
	   }
	}
}