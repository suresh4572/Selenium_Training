package ArrayExamples;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,5,9,11,6};
		int b[] = {1,9,10,6};
		
		boolean status=Arrays.equals(a, b);
		if(status==true)
		{
			System.out.println( " Arrays are equal");
		}
		else
		{
			System.out.println(" Arrays are not equal");
			
		}

	}

}
