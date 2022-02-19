package linearsearch;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[] = {1, 6, 5, 3, 4};
		int key = 5;
		boolean flag = false;
				
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == key)
			{
				System.out.println(key + " is found at index: " + i);
				flag = true;
				break;
			}
		}
		
		if(flag == false)
			System.out.println(key + " is not found");
	}

}
