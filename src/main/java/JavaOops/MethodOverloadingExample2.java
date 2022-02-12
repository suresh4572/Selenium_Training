package JavaOops;

public class MethodOverloadingExample2 {

	static int Multiply(int x, int y) {
		return x * y;

	}

	static void Multiply() {

		System.out.println(" Iam in no argumetns constructor");
	}

	static double Multiply(double a, double b) {

		return a + b;
	}

	static int Multiply(int x, int y, int z) {
		return x * y * z;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingExample2.Multiply();
		System.out.println(MethodOverloadingExample2.Multiply(2.5, 3.5));
		System.out.println(MethodOverloadingExample2.Multiply(2, 3));
		System.out.println(MethodOverloadingExample2.Multiply(4, 5, 5));

	}

}
