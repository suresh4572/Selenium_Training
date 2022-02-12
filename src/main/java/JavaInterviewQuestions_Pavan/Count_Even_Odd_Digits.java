package JavaInterviewQuestions_Pavan;

public class Count_Even_Odd_Digits {

	public static void main(String[] args) {


		int num =1234567;
		int even_count =0;
		int odd_count =0;

		while(num>0) //1234  123 12 1
		{

			int rem = num%10;  //1234%4=4   3  2  1
			if(rem%2==0) {

				even_count++;  //1 2 3 
			}else {

				odd_count++;  //1 2 3 4
			}
			num=num/10;  //1234/4=123   12  1

		}
		System.out.println(" The number of Even count is ::"+even_count);
		System.out.println(" The number of Odd count is ::"+odd_count);


	}

}
