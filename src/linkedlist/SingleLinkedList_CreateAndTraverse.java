package linkedlist;

import linkedlist.LinkedList.Node;

public class SingleLinkedList_CreateAndTraverse {

	public static void main(String[] args)
    {		
        LinkedList ll = new LinkedList();
        ll.head = new Node(100);        
        
        Node first =  new Node(200);
        ll.head.next = first;
        
        Node second = new Node(300);
        first.next = second;
        
        ll.print();
        
	}
}
class LinkedList
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
	}	
	public void print()
	{
		Node n = head;
		while (n!=null)
		{
			System.out.println(n.data+ " ");
			n = n.next;
		}
	}
	
	public int[] getData(int length)
	{
		int[] arr = new int[length];
		Node n = head;
		
		for (int i =0;i<arr.length;i++)
		{
			arr[i] = n.data;
			n = n.next;
		}
		return arr;
	}
	
	public void printCC()
	{
		Node n = head;
		do
		{
			System.out.println(n.data+ " ");
			n = n.next;
		}while (n!=head);
	}
	
	public int length()
	{
		int count = 0;
		Node n = head;
		do
		{
			count++;
			n = n.next;
		}while (n!=head);
		return count;
	}
	
	public void push(int new_data)
	{
		Node newdata = new Node(new_data);
		newdata.next = head;
		head = newdata;		
	}
	static int counter = 0;
	public void pushToCircularLinkedList(int new_data)
	{
		Node temp = head;
		Node prev = null;		
		if (head == null)	
		{
			head = new Node(new_data);	
			temp = head;
			counter++;
		}
		else
		{
			Node newnode = new Node(new_data);				
			for (int i =1;i<counter;i++)
			{				
				temp = temp.next;
			}
			counter++;
			temp.next = newnode;					
			newnode.next = head;
			
		}
	}
	
	static int splitcounter11 = 0;
	public void splitCircularLinkedList1(int new_data)
	{
		Node temp = head;
		Node prev = null;		
		if (head == null)	
		{
			head = new Node(new_data);	
			temp = head;
			splitcounter11++;
		}
		else
		{
			Node newnode = new Node(new_data);				
			for (int i =1;i<splitcounter11;i++)
			{				
				temp = temp.next;
			}
			splitcounter11++;
			temp.next = newnode;					
			newnode.next = head;
			
		}
	}
	static int splitcounter12 = 0;
	public void splitCircularLinkedList2(int new_data)
	{
		Node temp = head;
		Node prev = null;		
		if (head == null)	
		{
			head = new Node(new_data);	
			temp = head;
			splitcounter12++;
		}
		else
		{
			Node newnode = new Node(new_data);				
			for (int i =1;i<splitcounter12;i++)
			{				
				temp = temp.next;
			}
			splitcounter12++;
			temp.next = newnode;					
			newnode.next = head;
			
		}
	}
	
	public void deletebydata(int data)
	{
		Node temp = head;	
		Node Prev = head;
		
		if (temp.data==data)
		{			
			head = temp.next;
		}
		
		while (temp.data != data)
		{
			Prev = temp;
			temp = temp.next;
		}
		Prev.next = temp.next;
		if (temp.next == null)
		{
			Prev.next = null;
		}
	}
	public void deleteByPosition(int position)
	{
		Node temp = head;	
		Node Prev = head;
		
		if (head.next == null && head == null)
		{
			head = null;
			System.out.println("NO Elements in the List");
		}
		else
		{
			int count=0;
			if (position == 0)
			{
				head = head.next;
			}
			else
			{
				while (count<position)
				{
					Prev = temp;
					temp = temp.next;
					count++;
				}
				Prev.next = temp.next;
			}
			
			
		}
		
	}

	
}
