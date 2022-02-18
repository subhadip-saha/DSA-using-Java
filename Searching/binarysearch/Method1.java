//Binary Search in Java
/*
 * condition: Elements should be sorted either in ascending or descending order.
 */

package binarysearch;

import java.util.Scanner;
                                      // 2 5 9 10 18
public class Method1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearch bs = new BinarySearch();
		bs.getdata();
		bs.search();
	}
}

	class BinarySearch
	{
		int arr[] = new int[5];
		int key;
		
		void getdata()
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 5 numbers one by one: ");
			for(int i = 0; i < arr.length; i++)
			{
				System.out.println("Enter the number: ");
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the number you want to search: ");
			key = sc.nextInt();
		}
		
		void search()
		{
			int i, j, mid, flag = 0, pos = 0;
			i = 0; 
			j = 4;
			
			while(i <= j && flag == 0)
			{
				mid = (i + j)/2;
				
				if(key < arr[mid])
				{				
					j = mid - 1;
				}
				else if(key > arr[mid])
				{
					i = mid + 1;
				}
				else if(key == arr[mid])
				{
					pos = mid + 1;
					flag = 1;
				}
			}
			
			if(flag == 1)
				System.out.println("Element " + key + "is found at position: " + pos);
			else
				System.out.println("Element " + key + " is not found");

		}
		
	}

