package stack;

public class StackExampleUsingArrays 
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		s.push(500);
		s.push(600);
		
		s.print();
		
		s.peek();
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.print();

	}
}
