package Exception;

public class ArthemeticException {
	public static void main(String[] args) {
		try {
			int num1 = 5;
			int num2 = 0;
			int num3 =num1/num2;
			System.out.println("num3");
		}catch(ArithmeticException e) {
			
			System.out.println("You should not divide by zero");
		}
	}
}











