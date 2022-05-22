package stack;

public class StackExampleUsingStackClass {

	public static void main(String[] args) 
	{
		java.util.Stack<Integer> s = new java.util.Stack<>();
		
		s.push(100);
		s.push(200);
		s.push(300);
		
		for (int a : s)
		{
			System.out.println(a);
		}
		
		System.out.println("\n\n\n");
		
		s.pop();
		for (int a : s)
		{
			System.out.println(a);
		}
		
		System.out.println("\n\n\n");
		System.out.println(s.peek()+ "- Peek");

		System.out.println("\n\n\n");
		System.out.println(s.search(200) + "- Found");
	}

}
