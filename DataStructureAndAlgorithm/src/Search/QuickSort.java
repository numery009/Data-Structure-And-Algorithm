package Search;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] iArr = { 20, 35, -15, 7, 55, 1, -22 };
		int low = 0;
		int high = iArr.length - 1;

		QuickSort quickSort = new QuickSort();
		quickSort.quitSort(iArr, low, high);

		System.out.println(Arrays.toString(iArr));

	}

	public int pivot(int[] iArr, int low, int high) {
		int pivot = iArr[high];
		int i = low - 1;
		for (int j = low; j < iArr.length; j++) {
			if (iArr[j] < pivot) {

				i++;

				int temp = iArr[i];
				iArr[i] = iArr[j];
				iArr[j] = temp;

			}
		}

		int temp = iArr[i + 1];
		iArr[i + 1] = iArr[high];
		iArr[high] = temp;

		return i + 1;
	}

	public void quitSort(int[] iArr, int low, int high) {
		if (low < high) {
			int pi = pivot(iArr, low, high);

			quitSort(iArr, low, pi - 1);
			quitSort(iArr, pi + 1, high);
		}
	}

}
