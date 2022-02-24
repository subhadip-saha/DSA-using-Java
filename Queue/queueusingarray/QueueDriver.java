package queueusingarray;

public class QueueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingArray q = new QueueUsingArray(5);
		
		
		q.deQueue();
		
		System.out.println("-------------------");
	    // insert elements to the queue
	    q.enQueue(20);
	    q.enQueue(30);
	    q.enQueue(40);
	    q.enQueue(50);
	    q.enQueue(60);
	    
	    System.out.println();
		// print Queue elements
	    q.display();
	    System.out.println();
	    System.out.println("-------------------");
	    q.enQueue(70);

	    System.out.println("-------------------");
	    q.peek();
	    System.out.println("-------------------");

	    // deQueue removes element entered first i.e. 1
	    q.deQueue();
	    q.deQueue();
	    System.out.println("-------------------");
	    q.peek();
	    System.out.println("-------------------");
	    System.out.printf("\n\n after two elements deletion\n\n");
	    
	    // print Queue elements
	    q.display();
	    System.out.println("-------------------");
	    // 6th element can't be added to queue because queue is full
	    q.enQueue(120);
	}
}
