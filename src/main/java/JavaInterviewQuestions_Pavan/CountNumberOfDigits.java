package JavaInterviewQuestions_Pavan;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 23456789;
		
		int count =0;
		while(num!=0) {
			
			num =num/10;
			count++;
			
		}
		System.out.println(" Count Number of Digits :"+count);

	}

}
