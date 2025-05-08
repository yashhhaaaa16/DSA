package sorting;

public class Selection {

	public static void selectionSort(int [] arr)
	{
		int i, j, temp, min;
		
		for(i=0; i<arr.length; i++)
		{
			min = i;
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[min])
					min = j;
			}
			
			if(min != i)
			{
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		for(i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		
		int [] arr = {45,26,84,10,23,459,75,61,20};
		selectionSort(arr);
	}
}
