package CommonInterviewQuestions_Naveen;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =12345;
		int count=0;
		while(num!=0) {
			
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits :"+count);
	}

}
