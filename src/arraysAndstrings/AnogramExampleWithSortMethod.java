package arraysAndstrings;

import java.util.Arrays;

public class AnogramExampleWithSortMethod {

	public static void main(String[] args) {
		String str = "Hello".toLowerCase();
		String str1 = "hoell".toLowerCase();
		
		char[] ch = str.toCharArray();	
		char[] ch1 = str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if (new String(ch).equals(new String(ch1)))
        {
	      System.out.println("Anogram");
        }
		else
		{
			System.out.println("Not an Anogram");
		}
	}
}
