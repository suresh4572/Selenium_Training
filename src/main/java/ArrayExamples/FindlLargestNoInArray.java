package ArrayExamples;

public class FindlLargestNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] =  {2,5,8,9,12};
		int max =a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max)
			{
				
				max=a[i];
			}
		}
		
		System.out.println(" Print max no :"+ max);

	}

}
