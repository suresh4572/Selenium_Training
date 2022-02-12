package ArrayExamples;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,5,7,8,3,4,6,2,10};
		
		int sum1=0;
		
		// adding number in given array
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
			
		}
		System.out.println(" Sum of the given array :"+ sum1);
		
		int sum2=0;
		for(int i=1;i<=10;i++)
		{
			
			sum2=sum2+i;
		}
     
		System.out.println(" Sum of   range of  the given array :"+ sum2);
		System.out.println("Missing number of the given array : "+(sum2-sum1));
	}

}
