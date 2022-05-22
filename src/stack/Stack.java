package stack;

public class Stack 
{
   static final int MAX = 5;
   int top;
   int a[] = new int[MAX];
   void stack()
   {
	   top = 0;
   }
   
   boolean isEmpty()
   {
	   return (top<0);
   }
   
   boolean push(int x)
   {
	   if (top > (MAX - 1))
	   {
		   System.out.println("Stack Overflow.");
		   return false;
	   }
	   else
	   {
	      a[top] = x;
	      top++;
	      System.out.println("Pushed into the stack.");
	      return true;
	   }
   }
   
   int pop()
   {
	   if (top <= 0 )
	   {
		   System.out.println("Stack underflow.");
		   return 0;
	   }
	   else
	   {
		   int x = a[top-1];
		   top--;
		   System.out.println("Popped from stack - "+x);
		   return x;
	   }  
	   
   }
   int peek()
   {
	   if (top < 0 )
	   {
		   System.out.println("Stack underflow.");
		   return 0;
	   }
	   else
	   {
		   int x = a[top-1];
		   System.out.println("Peak from stack - "+x);
		   return x;
	   }  
   }
   
  void print()
  {
	  for (int i = top-1;i>=0;i--)
	  {
		  System.out.println(a[i]);
	  }
  }
  
  Node head;
  static class Node
  {
	  int data;
	  Node next;
	  
	  Node(int newdata)
	  {
		  this.data = newdata;
		  next = null;
	  }
   }
  
  public void pushll(int data)
  {
	  Node newnode = new Node(data);
	  if (head == null)
	  {
		  head = newnode;
	  }
	  else
	  {
		  Node temp = head;
		  head = newnode;
		  newnode.next = temp;
	  }
	  System.out.println(newnode.data+" - Pushed");
  }
  
  public void popll()
  {
	  int popped = Integer.MIN_VALUE;
	  if (head == null)
	  {
		  System.out.println("Stack is Empty");
	  }
	  else
	  {
		  popped = head.data;
		  head = head.next;	
		  System.out.println(popped+" - Popped");
	  }
	  
  }
  
  public void peekll()
  {
	  int peek = Integer.MIN_VALUE;
	  if (head == null)
	  {
		  System.out.println("Stack is Empty");
	  }
	  else
	  {
		  peek = head.data;		
		  System.out.println(peek+" - peeked");
	  }
	 
  } 
  

}
