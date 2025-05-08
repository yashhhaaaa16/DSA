package sorting;

public class Merge_Ver1 {

	public static void merge1(int [] arr1, int [] arr2, int [] res)
	{
		int i, j, tar;
		i = j = tar = 0;
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				res[tar] = arr1[i];
				tar += 1;
				i += 1;
			}
			else if(arr1[i] > arr2[j])
			{
				res[tar] = arr2[j];
				tar += 1;
				j += 1;
			}
			else
			{
				res[tar] = arr1[i];
				tar += 1;
				i += 1;
				j += 1;
			}
		}
		while(i<arr1.length)
		{
			res[tar] = arr1[i];
			tar += 1;
			i += 1;
		}
		while(j<arr2.length)
		{
			res[tar] = arr2[j];
			tar += 1;
			j += 1;
		}
		for(i=0; i<res.length; i++)
			System.out.print(res[i]+" ");
	}
	
	public static void main(String[] args) {
		
		int [] arr1 = {2,5,8,15,25,45,66};
		int [] arr2 = {4,7,10,13,24,35,39,55,59,65,88};
		int [] res = new int [20];
		
		merge1(arr1, arr2, res);
	}
}
