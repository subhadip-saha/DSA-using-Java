package linearsearch;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 6, 5, 3, 4};
		int key = 5;
		int temp = 0;
				
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == key)
			{
				System.out.println(key + " is found at index: " + i);
				temp = temp +1;
//if we do not use break then even after the element is found the loop keep on continue.We want, to 
//break immediately from the loop as soon as the element is found.It reduces the time complexity.			
				break;					
			}
		}
		
		if(temp == 0)
			System.out.println(key + " is not found");
		
	}

}
