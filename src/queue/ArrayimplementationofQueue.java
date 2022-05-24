package queue;
public class ArrayimplementationofQueue 
{
	public static void main(String[] args) 
	{
		Queue1 q = new Queue1(10);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		q.enque(6);
		q.enque(7);
		q.enque(8);
		q.enque(9);
		q.enque(10);
		q.enque(13);
		q.enque(14);
		
		q.display();
		
		q.deque();
		q.deque();
		q.deque();
		q.deque();
		
		
		q.display();
		
		q.getRear();
		q.getFront();
		

	}
}
class Queue1
{	
	int _arrlength = 0;
	int[] arr = null;
	int front = -1;
	int rear = -1;
	public Queue1(int arrlength)
	{
		this._arrlength = arrlength;
		arr = new int[this._arrlength];
	}
	
	public void enque(int x)
	{
		if (front == -1)
		{
			front++;
			rear++;
			arr[front] = x;
			System.out.println(arr[front] + " - element enqued");
		}
		else if (front == _arrlength-1)
		{
			System.out.println("Queue is overflow");
		}
		else
		{
			front++;
			arr[front] = x;
			System.out.println(arr[front] + " - element enqued");
		}		
	}
	public void deque()
	{
		if (front == -1)
		{
			System.out.println("\nQueue is underflow");
		}
		else
		{
			System.out.println("\n\n"+arr[front]+" - Element Dequed.");
			front--;
		}
	}
	
	public void display()
	{
		System.out.println("\nElements in the Queue");
		for (int i = front;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public void getRear()
	{
		if (front == -1)
		{
			System.out.println("\nQueue is underflow");
		}
		else
		{
			System.out.print("\nRear Element - "+arr[rear]+" ");
		}
	}
	
	public void getFront()
	{
		if (front == -1)
		{
			System.out.println("\nQueue is underflow");
		}
		else
		{
			System.out.print("\nFront Element - "+arr[front]+" ");
		}
	}
}
