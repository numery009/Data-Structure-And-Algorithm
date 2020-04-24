package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] iArr = { 20, 35, -15, 7, 55, 1, -22 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < iArr.length; firstUnsortedIndex++) {
			int newElement = iArr[firstUnsortedIndex];

			int i;

			for (i = firstUnsortedIndex; i > 0 && iArr[i - 1] > newElement; i--) {
				iArr[i]=iArr[i-1];
			}
			iArr[i]=newElement;
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}

}
