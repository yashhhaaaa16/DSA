package stack;

public class ArrayDup {
	public static void main(String[] args) {

		//int arr[] = new int[] { 3, 12, 23, 5, 3, 13, 12, 23, 7, -999 };
		int i, j, k, index = 0;

	
		
		//=================  O(n³) =======================//
		
		/*	for (i = 0; arr[i] != -999; i++) 
		{
			for (j = i + 1; arr[j] != -999; j++) 
			{
				if (arr[i] == arr[j]) 
				{
					for (k = j; arr[k] != -999; k++) 
					{
						arr[k] = arr[k + 1];
					}
				}
			}
		}*/
		
		
		/*
		 * for (i = 0; arr[i] != -999; i++) { System.out.print(arr[i] +" "); }
		 */

		//=================  O(n²) =======================//
		
		/*
		 * int tar [] = new int [arr.length]; tar[0] = arr[0]; for(i=0; arr[i] != -999;
		 * i++) { for(j=0; j <= index; j++) { if(arr[i] == arr[j]) { break; }
		 * 
		 * } if(j>index) { index += 1; tar[index] = arr[i]; } } tar[index+1] = -999;
		 * 
		 * 
		 * for (i = 0; tar[i] != -999; i++) { System.out.print(tar[i] +" "); }
		 */
		
		//================== O(n) =======================//
		
		int arr [] = new int [] {5,12,7,10,3,7,12,10,-999};
		int cnt [] = new int [13];
		
		for(i=0; arr[i] != -999; i++)
		{
			cnt[arr[i]] ++ ;
		}
		for(i=0,j=0; arr[i] != -999; i++)
		{
			if(cnt[arr[i]] > 0)
			{
				arr[j] = arr[i];
				j++;
				cnt[arr[i]] = 0;
			}
		}
		arr[j] = -999;
		
		for(i=0; arr[i] != -999; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
