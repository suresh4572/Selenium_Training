package ArrayExamples;

public class MaxNoInTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{6,8,2,1},{10,3,9,5}};
		
		int max = a[0][0];
		
	   for(int i=0;i<a.length;i++)
	   {
		   
		   for(int j=0;j<a[0].length;j++)
		   {
			   
			   if(a[i][j]>max) {
				   
				   max=a[i][j];
			   }
		   }
	   }
	   
	   System.out.println(" Print Max no in Array :"+max);
	}


}