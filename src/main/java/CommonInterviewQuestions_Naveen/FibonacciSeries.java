package CommonInterviewQuestions_Naveen;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =10;
		int n1=0;
		int n2=1;
		int sum =0;
		
		for(int i=2;i<=num;i++) {
			System.out.print(" "+n1);
			sum = n1+n2;
			
			n1=n2;
			n2=sum;


		}

	}

}
