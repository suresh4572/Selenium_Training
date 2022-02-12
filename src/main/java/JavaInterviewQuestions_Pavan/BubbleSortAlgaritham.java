package JavaInterviewQuestions_Pavan;

import java.util.Arrays;

public class BubbleSortAlgaritham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 7, 9, 1, 3 };
		int n = a.length;
		int temp;
		System.out.println("Arrays before sorting" + Arrays.toString(a));

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}

		System.out.println("Arrays after sorting" + Arrays.toString(a));
	}

}
