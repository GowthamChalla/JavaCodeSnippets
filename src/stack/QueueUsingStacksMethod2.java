package stack;
import java.util.Stack;
public class QueueUsingStacksMethod2 
{

	public static void main(String[] args)
	{
	  Queue1 q = new Queue1();
	  q.enque(10);
	  q.enque(20);
	  q.enque(30);
	  q.enque(40);
	  q.enque(50);	
	  
	  q.display();
	  
	  q.deque();
	  q.deque();
	  q.deque();
	  q.deque();
	  q.deque();
	  q.deque(); 	
	}
}
class Queue1
{
	Stack<Integer> S1 = new Stack<>();
	Stack<Integer> S2 = new Stack<>();
	
	public void enque(int x)
	{
		while(!S2.empty())
		{
			S1.push(S2.pop());
		}
		
		S1.push(x);
	}
	
	public void display()
	{
		System.out.print("\n\n"+S1);
	}
	
	public void deque()
	{
		if (S2.empty())
		{
			while(!S1.empty())
			{
				S2.push(S1.pop());
			}
		}
		if (S2.empty())
		{
			System.out.print("Stack is Empty");
		}
		else
		{
		
		 System.out.println("\n"+ S2.pop() + " - Popped");
		 
		 System.out.println("\n Remaining Elements - "+S2);
		}
	
	}
}
