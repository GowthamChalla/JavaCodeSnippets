package linkedlist;

import linkedlist.LinkedList.Node;

public class SingleLinkedList_AddNodeAtTheGivenPosition {

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
		  
		  //Create new node Node
		  Node newnode = new Node(400);
		  
		  //Traverse until the given position
		  // Assume Position is between first and second
		  
		  Node tnode = ll.head;
		  int count = 1;
		  while (tnode.next!=null)
		  {			  
			  if (count == 2)
			  {
				  newnode.next = tnode.next;
				  tnode.next = newnode;
				  break;
				  
			  }
			  tnode = tnode.next;
			  count++;
		  }
		  
		  
		//Print the node data of each node
		  Node n = ll.head;	  
		  while (n!=null)
		  {
			  System.out.println(n.data);
			  n=n.next;
		  }

	}

}
