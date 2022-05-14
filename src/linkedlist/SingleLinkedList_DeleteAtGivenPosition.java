package linkedlist;

public class SingleLinkedList_DeleteAtGivenPosition 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
        ll.push(100);
        ll.push(200);
        ll.push(300);
        ll.push(400);
        ll.push(500);
        
        System.out.println("\n\nFull List of elements");
        ll.print();
        
       ll.deleteByPosition(4);
       System.out.println("\n\nElements after delete.");
       ll.print();
        
        

	}

}
