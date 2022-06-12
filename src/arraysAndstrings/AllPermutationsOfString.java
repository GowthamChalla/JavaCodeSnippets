package arraysAndstrings;
public class AllPermutationsOfString {

	public static void main(String[] args) 
	{
		String str = "abc";
		char[] ch = str.toCharArray();
		strPermutation(ch);
		
	}
	public static void strPermutation(char[] ch)
	{
		int ind = 0;
		int j = 0;
		while (j<ch.length)
		{
			ind = j;	
		for (int i = 0;i<ch.length;i++)
			{
				System.out.print(ch[ind]);	
				
				if (ind == ch.length-1)
				{
					ind = 0;
				}
				else
				{
					ind++;
				}
				
			}
		j++;
		System.out.println("\n");	
		for (int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println("\n");	
		}
		
	}
}
