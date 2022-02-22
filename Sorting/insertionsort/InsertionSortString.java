//Insertion Sort in Java 

package insertionsort;

public class InsertionSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,1,6,2,4,3};
		int temp,j;
		for(int i = 1; i < arr.length; i++)
		{
			temp = arr[i];
			j = i;
			
			while(j > 0 && arr[j-1] > temp)
			{
				arr[j] = arr[j-1];
				j = j-1;
			}
			
			arr[j] = temp;
		}
		
		System.out.println("Sorted array is:" );
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}
