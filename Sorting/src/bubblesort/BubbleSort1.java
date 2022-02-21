//Bubble Sort of integers in Java Program
//ascending order

package bubblesort;

public class BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int arr[] = {36,19,29,12,5};
		int temp;
		//first for loop checks number of rounds
		for(int i = 0; i < arr.length; i++)				//i <= arr.length - 1;  same condition
		{
		//second for loop iterates through the elements
			for(int j = 0; j < arr.length - 1; j++)				//if,  j <= arr.length - 1; then we cannot access j+1 at the last, index out of bound
			{
				if(arr[j] >= arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is: ");
		for(int k = 0; k <= arr.length - 1; k++)
		System.out.print(arr[k] + " ");
*/		
		/*
		 * optimized code
		 * 
		 * here, i = 0 means first round
		 * after first round, largest element is placed at the last. In second round we do not need to consider
		 * the last array element because that is already sorted in first round. So, in second round last element
		 * should be ignored.After second round, second largest element is placed at second last position.
		 * So, in third round we do not need to consider the last two array elememts because they are already sorted
		 * eg: 5,3,2 -> 3,2,5 -> 2,3,5
		 */
		

/*		
		int arr[] = {36,19,29,12,5};
		int temp;
		for(int i = 0; i < arr.length; i++)							//i <= arr.length - 1;  same condition
		{
			for(int j = 0; j < arr.length - 1 - i; j++)				//if,  j <= arr.length - 1; then we cannot access j+1 at the last, index out of bound
			{
				if(arr[j] >= arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is: ");
		for(int k = 0; k <= arr.length - 1; k++)
		System.out.print(arr[k] + " ");
*/
		
		/*
		 * more optimized code
		 * 
		 * if the elements are already sorted before the no. of rounds completed, then first for loop need not to be
		 * executed again. for eg: 3,2,5 - as our previous code - 2 rounds would happend, but after first round
		 * that array is already sorted that is 2,3,5 - so no need to go for second round.
		 * because in second round swapping would not happen as the elements are already sorted.(Swapping happens 
		 * only when the elements are not sorted)
		 */
		
		
		int arr[] = {36,19,29,12,5};
		int temp;
		for(int i = 0; i < arr.length; i++)				//i <= arr.length - 1;  same condition
		{
			int flag = 0;
			for(int j = 0; j < arr.length - 1 - i; j++)				//if,  j <= arr.length - 1; then we cannot access j+1 at the last, index out of bound
			{
				if(arr[j] >= arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
					flag = 1;		//flag is 1 means swapping has been happened so, elements are swapped
				}
			}
			
			if(flag == 0)	//if flag is 0, it means in this round swapping not happened so, elements are not swapped .The elements are already sorted, no need to go for next rounds.
				break;
		}
		System.out.println("Sorted array is: ");
		for(int k = 0; k <= arr.length - 1; k++)
		System.out.print(arr[k] + " ");
	}

}
