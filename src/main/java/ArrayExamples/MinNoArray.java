package ArrayExamples;

public class MinNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,5,1,3,9};
		int min =a[0];
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]<min)
			{
				min = a[i]; 
			}
		}
		
      System.out.println("Print Min NO of Array : " + min);
	}

}
