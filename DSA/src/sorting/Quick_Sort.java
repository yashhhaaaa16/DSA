package sorting;

public class Quick_Sort 
{
	public static int partition(int arr[],int low,int high)
	{
		int left,right,pivot,temp;
		
		right=high;
		left=low;
		pivot = arr[low];
	
	while(left<=right)
	{
		while(arr[left]<=pivot && left<high)
		{
			left++;
		}
		while(arr[right]>pivot)
		{
			right--;
		}
		if(left<right)
		{
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		else
			left++;
	}
	
		arr[low]=arr[right];
		arr[right]=pivot;
		
		return right;
    }
	
	public static void Quicksort(int arr[], int low, int high)
	{
		int pivloc;
		
		if(low>=high)
			return;
		pivloc=partition(arr,low,high);
		
		Quicksort(arr,low,pivloc-1);
		Quicksort(arr,pivloc+1,high);
	}
	
	public void display(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
		    System.out.print(arr[i]+" ");

		}
	}
	
	public static void main(String[] args) {
		{
			int arr[] = {10,50,68,32,46};
			Quicksort(arr,0,arr.length-1);
			for(int i:arr)
			{
				System.out.print(i+" ");
			}
		}
	}
}
