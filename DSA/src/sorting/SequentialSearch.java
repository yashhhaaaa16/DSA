package sorting;

public class SequentialSearch {

	public static int search(int [] arr, int key)
	{
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == key)
			return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr [] = {45,23,68,20,1,78,13,35};
		System.out.print(search(arr,10));
	}
}
