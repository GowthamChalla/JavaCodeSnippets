package linkedlist;

import linkedlist.LinkedList.Node;

public class SingleLinkedList_AddNodeAtEnd 
{
  public static void main(String args[])
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
	  
	  //Assign a Node Variable to Head Node, This is to start traversing the nodes
	  Node tnode = ll.head;
	  
	  //Loop through nodes until we find the last node
	  while(tnode.next !=null)
	  {
		  tnode = tnode.next;
	  }
	  
	  //Link last element to new node
	  tnode.next = newnode;
	  
	  //Assign null to the new node
	  newnode.next = null;
	 
	  //Print the node data of each node
	  Node n = ll.head;	  
	  while (n!=null)
	  {
		  System.out.println(n.data);
		  n=n.next;
	  }
  }
}
