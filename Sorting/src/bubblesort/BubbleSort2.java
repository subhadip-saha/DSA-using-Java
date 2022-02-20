//Bubble Sort in Java
//ascending order

package bubblesort;

import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bubbles bs = new Bubbles();
		bs.getData();
		
		System.out.println("Unsorted array is: ");
		bs.putData();
		
		bs.sort();
		System.out.println();
		
		System.out.println("Sorted array is: ");
		bs.putData();
	}
}
	
	class Bubbles
	{
		int arr[] = new int[5];
		
		public void getData()
		{
			Scanner sc = new Scanner(System.in);
			for(int i = 0; i < 5; i++)
			{
				System.out.println("Enter no: ");
				arr[i] = sc.nextInt();				
			}
			
			sc.close();
		}
		
		public void putData()
		{
			for(int i = 0; i < 5; i++)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		public void sort()
		{
			for(int i = 0; i < arr.length; i++)				//i <= arr.length - 1;  same condition
			{
				boolean isSwapped = false;
				
				for(int j = 0; j < arr.length - 1 - i; j++)				//if,  j <= arr.length - 1; then we cannot access j+1 at the last, index out of bound
				{
					if(arr[j] >= arr[j+1])
					{
						isSwapped = true;
						swap(arr, j+1, j);
					}
				}
				
				if(isSwapped == false)	//if (!isSwapped)
					break;
			}
		}
			
		public void swap(int arr[], int i, int j)
		{
			int temp = arr[j+1];
			arr[j+1] = arr[j];
			arr[j] = temp;
		}
	}


