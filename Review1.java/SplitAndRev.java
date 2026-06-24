import java.util.*;
public class SplitAndRev
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] words = str.split(" ");

		String reversed = "";
        for(int i=0;i<words.length;i++)
        {
            String word = words[i];
            
            for(int j=word.length()-1;j>=0;j--)
            {
                reversed = reversed+word.charAt(j);
            }
            reversed = reversed+" ";
        }
        System.out.print(reversed);
	}
}