package Exception;

public class ArtheneticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=9;
			int b=0;
			int c=a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			
			System.out.println(" AtithmeticException....");
		}

	}

}
