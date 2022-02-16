package linearsearch;

public class Method1 {

	public static int linearSearch(int a[], int key)
	{
		int n = a.length;
		for(int i = 0; i < n; i++)
		{
			if(a[i] == key)
			{
				return i;		//element is found
			}
		}
		return -1;				//element is not found
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 6, 5, 3, 4};
		int key = 5;
		System.out.println(key + " is found at index: " + linearSearch(arr, key));
	}

}

