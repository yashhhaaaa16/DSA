package sorting;

public class Insertion {

	public static void insertionSort(int [] arr)
	{
		int i, j, k;
		for(i=1; i<arr.length; i++)
		{
			k = arr[i];
			for(j = i-1; j>=0 && k<arr[j]; j--)
			{
				arr[j+1] = arr[j];
			}
			arr[j+1]= k;
		}
		
		for(i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		
		int [] arr = {158,23,56,4,89,12,2,3,48,53};
		insertionSort(arr);
	}
}
