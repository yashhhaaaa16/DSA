package sorting;

public class BinarySearch {

	public static int binarySearch(int arr[], int key) {
		int low, high, mid;
		low = 0;
		high = arr.length - 1;
		mid = (low + high) / 2;

		while (arr[mid] != key && low < high) {
			if (key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
			mid = (low + high) / 2;
		}
		if (arr[mid] == key) {
			return mid;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 10,20,30,40,50,60,70,80 };
		System.out.print(binarySearch(arr, 30));
	}
}
