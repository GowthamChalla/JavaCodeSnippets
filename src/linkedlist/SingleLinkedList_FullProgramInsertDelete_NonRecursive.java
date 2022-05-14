package linkedlist;

public class SingleLinkedList_FullProgramInsertDelete_NonRecursive {

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
        
        ll.deletebydata(500);
        System.out.println("\n\nList of elements after Delete");
        ll.print();
	}

}
