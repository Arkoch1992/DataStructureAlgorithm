package binarySearch;

public class BinarySearchIterative {
	public static void main(String arg[]) {
		int arrList[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int searchNo = binarySearch(arrList, 2, arrList.length);
		System.out.println("Binay No:" + searchNo);
	}

	static int binarySearch(int[] arrList, int key, int heighest) {
		int low = 0;

		while (low <= heighest) {
			int mid = (low + heighest) / 2;
			if (key == arrList[mid]) {
				return mid;
			}
			if (key < arrList[mid]) {
				heighest = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;

	}
}
