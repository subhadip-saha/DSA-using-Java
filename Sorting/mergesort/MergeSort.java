//Merge Sort in Java 

package mergesort;

public class MergeSort {

	int[] arr;
	int[] tempMergeArr;
	int length;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputArr = {48,36,15,52,19,94,21};
		
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		
		for(int i : inputArr)
		{
			System.out.print(i + " ");
		}
	}
	
	public void sort(int inputArr[])
	{
		this.arr = inputArr;
		this.length = inputArr.length;		//length = 7
		this.tempMergeArr = new int[length];
		divideArray(0, length-1);
	}
	
	public void divideArray(int lowerindex, int higherindex)
	{
		if(lowerindex < higherindex)
		{
			int middle = lowerindex + (higherindex - lowerindex) / 2;
			
			divideArray(lowerindex, middle); 			//it will sort the left hand side of the array
			
			divideArray(middle + 1, higherindex); 		//it will sort the right hand side of the array
			
			mergeArray(lowerindex, middle, higherindex);
		}
	}
	
	public void mergeArray(int lowerindex, int middle, int higherindex)
	{
		for(int i = lowerindex; i <= higherindex; i++)
		{
			tempMergeArr[i] = arr[i];
		}
		
		int i = lowerindex;
		int j = middle + 1;
		int k = lowerindex;
		
		while(i <= middle && j<= higherindex)
		{
			if(tempMergeArr[i] <= tempMergeArr[j])
			{
				arr[k] = tempMergeArr[i];
				i++;
			}
			else
			{
				arr[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		
		while(i <= middle)
		{
			arr[k] = tempMergeArr[i];
			k++;
			i++;
		}
	}
	

}
