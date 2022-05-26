package arraysAndstrings;

public class StringBasicExample1 
{
	public static void main(String[] args) 
	{
      String str = "Apple";      
      StringBuffer sb = new StringBuffer("Apple");      
      StringBuilder sbr = new StringBuilder("Apple");
      
      System.out.println(str+ " - "+ sb + " - "+sbr);
	}
}
