package sorting;

public class Merge {

	public static void merge(int arr[], int res[], int low1, int high1, int low2, int high2)
	{
		int i, j, tar;
		i = low1;
		j = low2;
		tar = low1;
		
		while(i <= high1 && j <= high2)
		{
			if(arr[i] < arr[j])
			{
				res[tar] = arr[i];
				tar += 1;
				i += 1;
			}
			else if(arr[i] > arr[j])
			{
				res[tar] = arr[j];
				tar += 1;
				j += 1;
			}
			else
			{
				res[tar] = arr[i];
				tar += 1;
				i += 1;
				j += 1;
			}
		}
		while(i <= high1)
		{
			res[tar] = arr[i];
			tar += 1;
			i += 1;
		}
		while(j <= high2)
		{
			res[tar] = arr[j];
			tar += 1;
			j += 1;
		}
	}
	
	public static void copy(int arr[], int temp[], int low, int high)
	{
		int i = low;
		while(i<=high)
		{
			arr[i] = temp[i];
			i += 1;
		}
	}
	
	public static void mergeSort(int arr[], int low , int high)
	{
		int mid;
		int temp [] = new int [arr.length];
		
		if(low < high)
		{
			mid = (low + high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			
			merge(arr, temp, low, mid, mid+1, high);
			copy(arr, temp, low, high);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int arr [] = {13,39,45,88,8,4,10,25,65,37};
		mergeSort(arr, 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
	}
}
