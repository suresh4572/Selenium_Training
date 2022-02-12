package ArrayExamples;

public class MaxNoArray {
	
	public void maxNo() {

		int a[]= {10,5,1,3,9};
		int max = a[0];
		
		for(int i=0;i<a.length;i++) 
		
		{
			
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println(" Print Max NO value :" + max);
	}
	public  static void  main(String[] args) {
	
		
		MaxNoArray obj = new MaxNoArray();
		  obj.maxNo();
		  
	}
	
	
}
