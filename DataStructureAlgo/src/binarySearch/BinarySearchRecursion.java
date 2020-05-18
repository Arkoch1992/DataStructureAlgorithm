package binarySearch;

public class BinarySearchRecursion {
	public static void main(String arg[]) {
		int arrList[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int searchNo = binarySearch(arrList, 8, arrList.length, 0);
		System.out.println("Binay No:" + searchNo);
	}

	static int binarySearch(int[] arrList, int key, int heigh, int low) {

		int mid = (low + heigh) / 2;
		if (low == heigh) {
			if (key == arrList[mid]) {
				return mid;
			} else {
				return -1;
			}
		} else {
			if (key == arrList[mid]) {
				return mid;
			}
			if (key < arrList[mid]) {
				heigh = mid - 1;
				return binarySearch(arrList, key, heigh, low);
			} else {
				low = mid + 1;
				return binarySearch(arrList, key, heigh, low);
			}
		}

	}
}
