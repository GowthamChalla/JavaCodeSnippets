package stack;

public class StackExampleUsingLinkedList {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.pushll(100);
		s.pushll(200);
		s.pushll(300);
		s.pushll(400);
		s.pushll(500);
		System.out.println("\n\n\n");
	    s.popll();
	    s.popll();
	    s.popll();
	    s.popll();
	    s.popll();
	    s.popll();
	    System.out.println("\n\n\n");
	    s.peekll();

	}

}
