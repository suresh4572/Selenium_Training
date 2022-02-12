package JavaInterviewQuestions_Pavan;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//factorial of 5!=1*2*3*4*5=120 or 5!=5*4*3*2*1 =120
		
		int num =5;
		long factorial =1;
		for(int i =1;i<=num;i++) {
			
			factorial = factorial *i;   //1
		}
		System.out.println(" The factorial of a Number is ::"+factorial);

	}

}
