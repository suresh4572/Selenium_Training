package JavaInterviewQuestions_Pavan;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num  =sc.nextInt(); //1234
		//Approach 1 -Algaritham
	/*	int rev =0;
		
		while(num!=0) {
			
			 rev= rev*10+num%10;
			 num =num/10;
						
		}
		System.out.println("Rever Number :"+rev);
		*/
		
		 /* //Approach2:-Using string Buffer class
		
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev1 = sb.reverse();
		
		System.out.println("Rever Number :"+rev1);
		*/
		
		//Approach 3:-StringBuilder
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev2 =sbl.reverse();
		
		System.out.println("Rever Number :"+rev2);
		
		
		
	}
	
	

}
