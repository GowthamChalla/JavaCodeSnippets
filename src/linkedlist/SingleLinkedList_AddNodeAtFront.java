package linkedlist;

import linkedlist.LinkedList.Node;

public class SingleLinkedList_AddNodeAtFront {

	public static void main(String[] args) 
	{
		 //Create an object to LinkedList Class
		  LinkedList ll = new LinkedList();
		  
		  //Create a Head Node
		  ll.head = new Node(100);
		  
		  //Create Second Node
		  Node second = new Node(200);
		  
		  //Link Head Node and Second Node
		  ll.head.next = second;
		  
		  //Create third Node
		  Node third = new Node(300);
		  
		  //Link Second Node and Third Node
		  second.next = third;
		  
		  //Create new node
		  Node newnode = new Node(400);
		  
		  //link new node to head node
		  newnode.next = ll.head;
		  
		  //make new node as head node.
		  ll.head = newnode;
		  
		//Print the node data of each node
		  Node n = ll.head;	  
		  while (n!=null)
		  {
			  System.out.println(n.data);
			  n=n.next;
		  }
	}

}


