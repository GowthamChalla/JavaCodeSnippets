package arraysAndstrings;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReverseTheWordsInSentence 
{
	public static void main(String[] args) 
	{
		StringTokenizer str = new StringTokenizer("I am living in Atlanta");
		ArrayList<String> arr = new ArrayList<>();
		
		while (str.hasMoreElements())
		{
			arr.add(str.nextToken());
		}
		String str1 = new String();
		for (int i = arr.size()-1; i >= 0 ;i--)	
		{
			str1 = str1.concat(arr.get(i)+" ");
		}
		System.out.println(str1);
	}

}
