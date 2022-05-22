package stack;

public class StackMultipleOperations 
{
	public static void main(String[] args) 
	{
		Stack2 obj = new Stack2();
		obj.push(10);
		obj.push(12);
		obj.push(6);
		obj.push(15);
		obj.push(12);
		obj.display();
		
		obj.getMin();
		
		obj.pop();
		
		obj.display();
		
        obj.pop();
		
		obj.display();
		
		obj.getMin();
		
        obj.pop();
		
		obj.display();
		
		obj.getMin();
		
		obj.pop();
			
		obj.display();
			
	    obj.getMin();
	    
	    obj.pop();
		
		obj.display();
			
	    obj.getMin();
	    
	    

	}
}
class Stack2
{
	java.util.Stack<Integer> S1 = new java.util.Stack<>();
	java.util.Stack<Integer> temp = new java.util.Stack<>();
	
	public void push(int x)
	{
		if (S1.empty())
		{
			System.out.println("\n"+S1.push(x) +" -- Popped to S1");
			System.out.println("\n"+temp.push(x) +" -- Pushed to temp ");
		  ;
		}
		else
		{
			System.out.println("\n"+S1.push(x) +" -- Popped to S1");
			int y = temp.peek();
			if (x < y)
			{
				System.out.println("\n"+temp.push(x) +" -- Pushed to temp ");
			}
		}
		
	}
	
	public void pop()
	{
		if (S1.isEmpty())
		{
			System.out.println("\nStack is Empty");
		}
		else
		{
		int i = S1.pop();
		int j = temp.peek();
		System.out.println("\n"+i +" -- Popped ");
		if (i == j)
		{
			temp.pop();
		}
		}
	}
	
	public void display()
	{
		System.out.println("\n\n All Elements in S1 stack - "+S1);
		System.out.println("\n\n All Elements in temp stack - "+temp);
	}
	
	public void getMin()
	{
		System.out.println("\n"+temp.peek()+ "  - Minimum Value");
	}
	
}
