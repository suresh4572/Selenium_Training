package CommonInterviewQuestions_Naveen;

public class largestIn_3Numbers {
	
	public static void main (String[] args) {


		//Approach 1:
		
		int a=333;
		int b=2222;
		int c=444;

		if(a>b && a>c) {

			System.out.println(a+ "   is larget number");
		} else if(b>c && b>a){

			System.out.println(b+" is largest number");

		} else{

			System.out.println(c+" is largest number");
		}
		
		//Approach2:
		int largest =c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(" Largest number is :"+largest);
		
		
		
		
	}
}
