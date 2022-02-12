package JavaInterviewQuestions_Pavan;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,7,9,10};
		int sum =0;
		
		/*for(int i=0;i<=a.length-1;i++) {
			
			sum = sum+a[i];
		}
      System.out.println("The sum of Arrays is ::"+sum); */
      
      //Approach2:nested for loop
      
      for(int value:a) {
    	  
    	  sum=sum+value;
      }
      System.out.println("The sum of Arrays is ::"+sum);
      
	}

}
