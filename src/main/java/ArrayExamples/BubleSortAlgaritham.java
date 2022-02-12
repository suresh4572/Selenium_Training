package ArrayExamples;



import java.util.Arrays;

public class BubleSortAlgaritham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,2,1,5,3};
		
		System.out.println(" Array before sorting :"+ Arrays.toString(a));
		 int n = a.length;
		 int temp;
		 for(int i=0; i<n-1;i++)  // Number of Passes
		 {
			 for(int j=0; j<n-1;j++) 
			 {
			if(a[j]>a[j+1])
			{
				temp =a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
				 
				 
			 }
			 
		 }
	
		 System.out.println(" Arrays after sorting :"+Arrays.toString(a));
	}
	
	}

