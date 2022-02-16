package linearsearch;

public class LinearSearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars = {"Mahindra", "BMW", "Ford", "Mazda", "TATA"};
		String key = "TATA";
		int temp = 0;
				
		for(int i = 0; i < cars.length; i++)
		{
			/*
			if(cars[i] == key)
			{
				System.out.println(key + " is found at index: " + i);
				temp = temp +1;
//if we do not use break then even after the element is found the loop keep on continue.We want, to 
//break immediately from the loop as soon as the element is found.It reduces the time complexity.			
				break;					
			}
			*/
			
			if(cars[i].equals(key))
			{
				System.out.println(key + " is found at index: " + i);
				temp = temp +1;
				break;	
			}
		}
		
		if(temp == 0)
			System.out.println(key + " is not found");
	}

}
