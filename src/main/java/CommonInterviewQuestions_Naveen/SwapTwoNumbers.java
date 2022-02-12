package CommonInterviewQuestions_Naveen;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int temp;
		System.out.println("Before Swapping a is ::"+a);
		System.out.println("Before Swapping b is ::"+b);
		System.out.println("*******************");

		/*temp =a;
		a=b;
		b=temp;
		System.out.println("After Swapping a is ::"+a);
		System.out.println("After Swapping b is ::"+b);

		
		System.out.println("*******************");
		*/
		a=a+b; // 10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		System.out.println("After Swapping a is ::"+a);
		System.out.println("After Swapping b is ::"+b);

	}

}
