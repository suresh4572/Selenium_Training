package JavaInterviewQuestions_Pavan;

public class SwppingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=30;
		
		System.out.println("Before swapping two numbers ::"+a+ " "+b);
		
		//logic 1- using Third variable
	/*	int t=a;  // 20
		a=b;  //30
		b=t; // 
		
		//logic 2-using + and - without third variable
		a=a+b;  //20+30 =50
		
		b=a-b; //50-30=20;
		a=a-b; //50-20=30;
		
		// logic 3- using * and - without third variable
       //a & b values  should not zeros
		a=a*b;
		b=a/b;
		a=a/b;
		//logic 4- bitwise XOR(^)
		a=a^b;
		b=a^b;
		a=a^b;*/
		
		//logic 5- Single statement
		b=a+b-(a=b);
		
		
		System.out.println("After swapping two numbers ::"+a+ " "+b);

	}

}
