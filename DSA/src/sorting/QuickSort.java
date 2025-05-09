package sorting;

public class QuickSort {

	public static int partition(int [] arr, int low, int high)
	{
		int left, right, pivot, temp;
		
		left = low;
		right = high;
		pivot = arr[low];
		
		while(left <= right)
		{
			while(arr[left] <= pivot && left < high)
			
				left ++;
			
			while(arr[right] > pivot)
			
				right --;
			
			if(left < right)
			{
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left ++;
				right --;
			}
			else
			{
				left ++;
			}
		}
		
		arr[low] = arr[right];
		arr[right] = pivot;
		
		return right;
	}
	
	public static void quickSort(int [] arr, int low, int high)
	{
		int pivotloc;
		if(low >= high)
			return;
		
		pivotloc = partition(arr, low, high);
		quickSort(arr, low, pivotloc-1);
		quickSort(arr, pivotloc+1, high);
	}
	
	public static void main(String[] args) {
		
		int [] arr = {37,45,7,4,10,65,88,13,25};
		quickSort(arr, 0, arr.length-1);
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
