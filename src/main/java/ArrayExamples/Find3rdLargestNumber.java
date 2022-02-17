package ArrayExamples;

public class Find3rdLargestNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a[] = {2,5,7,9,44,77,99};
		 
		 // First find largest element 
		 int first =a[0];
		 for(int i=0;i<a.length;i++) {
			 
			 if(a[i]>first){
				 
				 first =a[i];
			 }
		 }
		 System.out.println("Print first Largest Number :"+ first);

		 // Find Second Largest element
		  int second = a[0];
		 for(int i=0;i<a.length;i++) {
			 
			 if(a[i]>second && a[i]<first) {
				 
				 second =a[i];
			 }
		 }
		 System.out.println("Print Second Largest No :"+second);
		 
		 //  Find Third  larget element
		  int third = a[0];
			 for(int i=0;i<a.length;i++) {
				 
				 if(a[i]>third && a[i]<second) {
					 
					 third =a[i];
					 
					 
				 }
			 }
			 System.out.println("Print Second Largest No :"+third);
		 
		 
	}

}
