package JavaInterviewQuestions_Pavan;

public class FindMissingNumIn_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,5};
		int sum1=0;
		
		// sum1= 1+2+3+5=11
		//sum2 =1+2+3+4+5 =15
		//sum2-sum1=15-11= 4 ;Misisng number
		
		for(int i=0;i<a.length;i++) {
			
			sum1=sum1+a[i];
		}
		System.out.println("The sum of the given numbers::"+sum1);

		int sum2=0;
		for(int i=1;i<=5;i++) {
			
			sum2=sum2+i;
		}
		System.out.println(" The range is the given numbers:"+sum2);
		System.out.println("Missing number is ::" +(sum2-sum1));
	}
	


}
