package JavaInterviewQuestions_Pavan;

import java.util.Arrays;

public class HowToChekcTwoArraysEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,7,9,10};
		int	b[]= {1,4,7,9,10};
	
		//Approach 1:
		/*
		boolean status =Arrays.equals(a, b);
		
		if(status==true) {
			System.out.println("The Arrays are equal");
		}
		else {
			System.out.println("The arrays are not equal");
			
		}
		*/
		//Approach2:
		boolean status = true;
		
		if(a.length==b.length) {
			
			for(int i=0;i<a.length;i++) 
			{
				
				if(a[i]!=b[i]) {
					
					status=false;
				}
				
			}if(status==true) {
				
				System.out.println("The arrays are equal");
			}else {
				System.out.println("The arrays are Not equal");
			}
			
		}else {
			
			System.out.println("The arrays are NotEqual");
		}
		

	}

}
