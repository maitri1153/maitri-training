package array;

public class BinarySearch {

	int binarysearch(int arr[], int x) {
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			if (arr[mid] < x) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String args[]) {
		BinarySearch binarySearch = new BinarySearch();
		int arr[] = { 23, 34, 36, 37, 45, 46, 67, 68 };
		int element = 34;
		int position = binarySearch.binarysearch(arr, element);
		if (position == -1) {
			System.out.println("Element is not present in array ");
		} else {
			System.out.println("Element " + element + " is prensent at position " + (position + 1));
		}
	}

}
