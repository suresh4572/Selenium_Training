package JavaInterviewQuestions_Pavan;

import java.util.Scanner;

public class LargestOf3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number :");
		int b = sc.nextInt();
		
		System.out.println("Enter Third number :");
		int c = sc.nextInt();
		
	/*
	 	//Approach 1
	 
		
		if(a>b&& a>c) {
			
			System.out.println(" The lagest number is :"+a);
		}
	if(a>b&& a>c) {
			
			System.out.println(" The lagest number is :"+a);
		}
	if(b>a&& a>c) {
		
		System.out.println(" The lagest number is :"+b);
	}

	if(c>b&& c>a) {
		
		System.out.println(" The lagest number is :"+c);
	}
	*/

// Approach 2:-Ternary Operator
	
	/*int largest1 = a>b?a:b ;  //largest of a & b
	
	int largest2= c>largest1?c:largest1;   // largest of c & largest1
	*/
	
	int largest = c>(a>b?a:b)?c:(a>b?a:b);  // Write in single statement
	
	System.out.println("The largest Number is::"+largest);
			
	
	




	}

}
