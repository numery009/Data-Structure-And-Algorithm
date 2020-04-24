package sorting;

import java.util.ArrayList;

public class BubbleSort {

	public static void main(String[] args) {

		int[] iArr = { 20, 35, -15, 7, 55, 1, -22 };

		for (int i = iArr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (iArr[j] > iArr[j + 1]) {
					swap(iArr, j, j + 1);
				}
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}

	}

	public static void swap(int[] arr, int i, int j) {

		if (i == j) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
