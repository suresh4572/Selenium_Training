package ArrayExamples;

public class SumOfTwoElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,4,6,1,9,11};
		
		int  sum=0;
		 // Approach 1: Using nested for loop
		
		/*for(int  value : a)
		{
			
			sum =sum+value;
		}
		System.out.println(" Using Nested for loop Sum of Twoelements :"+ sum);*/
	//Approach 2 :
	
	for(int i=0;i<=a.length-1;i++) 
	
   {
	sum = sum+a[i];
		
	}
	System.out.println(" Using  for loop Sum of Twoelements :"+ sum);
}
}