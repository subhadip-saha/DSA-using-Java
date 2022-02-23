//Stack Data Structure using Arrays 

package stackusingarray;

class MyStack 
{

	int a[];		//empty array declared
	int top;		//a reference which refers to the topmost element of the stack
	int size;		//capacity of the array which should be defined before the stack implementation
	
	public MyStack(int capacity)	//constructor
	{
		size = capacity;	//or, this.size = capacity;	//initialize the capacity
		a = new int[size];	//initialize the array with capacity
		top = -1; 			//initially stack is empty so, there are no elements in the top 
		
	}
	
	void push(int data)
	{
		//checks if we reach the capacity or not
		if(top == size-1)							//if stack can hold total 3 elements then top index will be 2  
		{
			System.out.println("Stack overflow!!!");//stack is already full
		}
		else										//if stack is not full means stack is not reached to max capacity
		{
			top++;									//increase the top by 1 i.e. top = top + 1;
			a[top] = data;							//store the data where top is indicating
		}
			
	}
	
	int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow!!!");	//if stack is empty, no element can be taken out
			return -999;
		}
		else 
		{
			int res = a[top]; 							//topmost element is kept in result
			top--;										//decrease the top by 1  i.e. top = top - 1;
			return res;	
		}
	}
	
	int peek()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow!!!");	//if stack is empty, no top most element 
			return -999;
		}	
		else
		{
			//return a[top];
			int res = a[top];
			return res;	
		}
		
	}
	
	void display()
	{
	    if(top == -1)
	    {
	        System.out.println("The stack is empty.");
	    }
	    else
	    {
	        System.out.println("The elements in the stack are : ");
	        for(int i = top; i>=0; i--)		//elements are printed from top index towards 0th index
	        {
	            System.out.println(a[i]);
	        }
	    }
	}
	
}

public class SrackUsingArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack ms = new MyStack(5);
        System.out.println("*********Stack operations using array*********\n");  
        System.out.println("\n------------------------------------------------\n");  
        ms.pop();	//trying to remove element when stack is already empty
        
        System.out.println("=================");
        ms.push(10);
        ms.push(30);
        ms.push(50);
        ms.push(40);
        System.out.println("=================");
        ms.display();
        System.out.println("=================");
       // System.out.println("1. Size of stack after push operations: " + ms.size());
        ms.pop();
        ms.pop();
        ms.pop();
        System.out.println("=================");
        ms.display();
        System.out.println("=================");
       // System.out.println("1. Size of stack after push operations: " + StackCustom.size());
	}
	
	 

}




























