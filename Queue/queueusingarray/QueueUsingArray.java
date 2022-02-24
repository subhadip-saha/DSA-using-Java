package queueusingarray;

public class QueueUsingArray {

	int size;
	int queuearr[];			
	int front;				//index of element at the front of the queue	//deletion happens from the front end
	int rear;				//index of element at the rear of the queue		//insertion happens into the rear end
		
	QueueUsingArray(int n)
	{
		size=n;
		queuearr = new int[size];
		front=-1;
		rear=-1;
	}
	
	public void enQueue(int elem)
	{
		 if(rear == size - 1) 			//if(front == 0 && rear == size - 1) no need to check front
		{												//insert element into the queue //insertion happens always at the rear end
			System.out.println("Queue is full.");			//when queue is full that is the size of the queue is equivalent to the length of the array(data)				
		}												//then there is no room for adding another element, so throw exception
		else if(front == -1 && rear == -1)
		{									//for the very first time(means when size is 0 or front is -1), when one element is added,  
			front = rear = 0;									//then only front and rear both are changed to 0(0th index)
			queuearr[rear] = elem;
		}												//but remaining in all other cases only rear changes when insertion happens
		else
		{
			rear++;
			queuearr[rear] = elem;	
				
		}
													
									//so rear is incremented and at that position element is added
									//also size is incremented
	}
		
	public void deQueue()
	{													//delete element from the queue		//deletion happens always from the front end
		if(front == -1 && rear == -1) 
		{											//if the size of the queue is 0 i.e. no elements are present, but still someone wants to delete, then throw the suitable exception
			System.out.println("Queue is empty.");
		}
		else if(front == rear) 
		{										//when size is 0 it means there is no element in the queue then front=rear=-1 
			front = rear = -1;									//this condition is to avoid when front > rear i.e. when size is 0, don't do front++		
		}
		else
		{
			System.out.println("The dequeued element is: " + queuearr[front]);
			front++;
		}
	}
	
	public void display()
	{
		if(front == -1 && rear == -1)
		{													//if the size of the queue is 0 i.e. no elements are present, but still someone wants to delete, then throw the suitable exception
			System.out.println("Queue is empty.");
		}
		else
		{
			for(int i = front; i < rear +1; i++)
			{
				System.out.print(queuearr[i] + " ");
			}
		}
	}
	
	public void peek()
	{
		if(front == -1 && rear == -1)												//if the size of the queue is 0 i.e. no elements are present, but still someone wants to delete, then throw the suitable exception
			System.out.println("Queue is empty.");
		else
			System.out.println(queuearr[front]);			
	}
/*		int temp = data[front];							//store the element at the front which is to be deleted in the temp variable
		front++;										//when an element is deleted, increase the front index so that front indicates to the next element
		size--;											//deletion of one element will lead to decrease the size of the queue as well

		return temp;									//return the element which is deleted
	}*/
}

