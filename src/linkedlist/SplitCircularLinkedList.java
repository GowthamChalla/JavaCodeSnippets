package linkedlist;

import linkedlist.LinkedList.Node;

public class SplitCircularLinkedList {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();		  
		  
		  ll.pushToCircularLinkedList(100);
		  ll.pushToCircularLinkedList(200);
		  ll.pushToCircularLinkedList(300);
		  ll.pushToCircularLinkedList(400);
		  ll.pushToCircularLinkedList(500);
		  ll.pushToCircularLinkedList(600);	 
		  ll.pushToCircularLinkedList(700);
		  ll.pushToCircularLinkedList(800);
		  
		  int noOfElements = ll.length();
		  int[] lstOfElements = ll.getData(noOfElements);		  
		  LinkedList ll1 = new LinkedList();
		  
		  LinkedList ll2 = new LinkedList();
		  
		  for (int i =0;i<noOfElements;i++)
		  {
			  if (i<noOfElements/2)
			  {
				  ll1.splitCircularLinkedList1(lstOfElements[i]);
			  }
			  else
			  {
				 ll2.splitCircularLinkedList2(lstOfElements[i]);
			  }
		  }
		  
		  ll1.printCC();
		  
		  System.out.println("\n\n");
		  
		  ll2.printCC();
		  
		  
		  
		  
		  
		
	}

}
