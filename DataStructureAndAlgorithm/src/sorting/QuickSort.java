package sorting;
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] iArr = { 6, 5, 3, 1, 8, 7, 2, 4 };
		Arrays.sort(iArr);
		int value = doQuickSort(iArr);
		System.out.println(value);
	}

	public static int doQuickSort(int[] iArr) {
		int low = 0;

		int high = iArr.length-1;

		

		int number = 3;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (iArr[mid] == number)
				return 1;
			else if (number > iArr[mid])
				low = mid + 1;
			else if (number < iArr[mid])
				high = mid - 1;
		}

		return -1;
	}
}
