//Binary Search in Java 

package binarysearch;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,8,9,14,16,19,21,27,36,43,50,105};
		int srch = 14;
		int li = 0;						//lower index
		int hi = arr.length - 1;		//higher index
		int mi = (li + hi) / 2;			//middle index
		
		while(li <= hi)
		{
			if(srch == arr[mi])
			{
				System.out.println("Element is at " + mi + " index position.");
				break;		//otherwise infinite loop will begin
			}		
			else if(srch < arr[mi])
			{
				hi = mi - 1;
			}
			else						//srch > arr[mi]
			{
				li = mi + 1;
			}
			
			 mi = (li + hi) / 2;	
		}
		
		if(li > hi)
			System.out.println("Element is not found");
	}

}
