package CommonInterviewQuestions_Naveen;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	5!= 1*2*3*4*5=120
		
		int num =5;
		int factorial =1;
		
		for(int i=1;i<=num;i++) {
			
			factorial = factorial*i;
		}
		System.out.println("factorial is :"+factorial);

	}

}
