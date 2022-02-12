package JavaInterviewQuestions_Pavan;

import java.util.Random;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach 1:- Ranmdom class
		
		Random rand =  new Random();
		int rand_num =rand.nextInt(10);
		System.out.println(rand_num);
		
		double rand_dbl =rand.nextDouble(); // print random double numbers with range 0.0 and less than1.0
		System.out.println(rand_dbl);
		
		//Approach 2: Using Math
		System.out.println(Math.random());  //print random double 

	}

}
