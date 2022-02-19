package linearsearch;

import java.util.Scanner;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		linearSearch ls = new linearSearch();
		ls.getdata();
		ls.search();
	}
	
}
	
class linearSearch
	{
		int arr[] = new int[5];
		int key;
		public void getdata()
		{
			Scanner sc = new Scanner(System.in);
			for(int i = 0; i < 5; i++)
			{
				System.out.println("Enter no: ");
				arr[i] = sc.nextInt();				
			}
			
			System.out.println("Enter no to search: ");
			key = sc.nextInt();
			
			sc.close();
		}
		
		void search()
		{
			int i, pos, flag = 0;
			for(i = 0; i < arr.length; i++)
			{
				if(arr[i] == key)
				{
					flag = 1;
					pos = i + 1;
					System.out.println(key + " is found at position: " + pos);
					break;
				}
			}
			if(flag == 0)
				System.out.println(key + " is not found");
		}
	}

