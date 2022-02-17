package ArrayExamples;

public class AddtionOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating two matrices
		int a[][] = { { 1, 3, 5 }, { 2, 6, 8 } };
		int b[][] = { { 2, 8, 9, }, { 4, 7, 6 } };

		// creating another matrix to store the sum of two matrices

		int c[][] = new int[2][3];

		// adding and printing addition of 2 matrices

		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {
				c[row][col] = a[row][col] + b[row][col];

				System.out.println(c[row][col]);
			}
		System.out.println();
		}
	}

}
