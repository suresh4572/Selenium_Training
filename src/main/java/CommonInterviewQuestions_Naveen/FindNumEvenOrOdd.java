package CommonInterviewQuestions_Naveen;

import java.util.Scanner;

public class FindNumEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter number:");
		
		int num =reader.nextInt();
		if(num%2==0) {
			
			System.out.println(num+ "The number is even");
			
		}else {
			System.out.println(num+"The number is odd");
		}
		

	}

}
