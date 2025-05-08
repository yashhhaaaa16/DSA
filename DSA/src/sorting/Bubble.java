package sorting;

public class Bubble {

	public static void bubbleSort(int [] arr)
	{
		int n =arr.length;
		int i, j, temp, flag;
		
		for(i=n-1; i>=0; i--)
		{
			flag = 0;
			for(j=0; j<i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					flag = 1;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
								 
			}
			 if(flag == 0) break;
		}
		
		
	}
	
	public static void display(int [] arr)
	{
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	
	public static void main(String[] args) {
		
		int arr [] = {13,58,89,56,10,45,1,90};
		bubbleSort(arr);
		display(arr);
	}
}
