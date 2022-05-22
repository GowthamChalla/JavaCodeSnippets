package stack;
import java.util.Stack;

public class QueueUsingStacksMethod1 {

	public static void main(String[] args) 
	{
		Queue q = new Queue();
		
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		
		q.display();
		
		System.out.println("\n\n\n");
		q.deque();
		q.deque();
		q.deque();

	}
}
class Queue
{
	Stack<Integer> S1 = new Stack<>();
	Stack<Integer> S2 = new Stack<>();
	
	public void enque(int x)
	{
		while (!S1.isEmpty())
		{
			S2.push(S1.pop());
		}
		
		S1.push(x);
		
		while(!S2.isEmpty())
		{
			S1.push(S2.pop());
		}
	}
	
	public void display()
	{
		System.out.print(S1);
	}
	
	public void deque()
	{
		if (S1.isEmpty())
		{
			System.out.println("\n\nQueue is Empty");
		}
		else
		{
			int x = S1.peek();
			S1.pop();
			System.out.println(x+ " - Popped");
		}
	}
}
