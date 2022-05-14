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
	
	public void printCC()
	{
		Node n = head;
		do
		{
			System.out.println(n.data+ " ");
			n = n.next;
		}while (n!=head);
	}
	
	public void push(int new_data)
	{
		Node newdata = new Node(new_data);
		newdata.next = head;
		head = newdata;		
	}
	
	public void pushToCircularLinkedList(int new_data)
	{
		Node temp = head;
		if (head == null)	
		{
			head = new Node(new_data);	
			temp = head;
		}
		else
		{
			Node newnode = new Node(new_data);			
			newnode.next = head;
			do
			{
				if (temp.next == null)
				{
					temp.next = newnode;
				
				}
				else
				{
					 temp = temp.next;
				}					
			
			}while (temp.next != newnode);
			
			
			
			
			
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
