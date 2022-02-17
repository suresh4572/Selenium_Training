package ArrayExamples;

import java.util.Arrays;

public class AscendingOrderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 9,7,6,7,1,3};
		int temp =0;
		
		// Sort the array in ascending order
		for(int i=0; i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					
					temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		}
		
System.out.println(" Printing value in Ascending order :"+Arrays.toString(a));
		// Displaying elements of array after sorting
//		System.out.println("Printing value in Ascending order  :");
//		 for(int i=0;i<a.length;i++) {
//			 
//		 System.out.println(a[i]);
//		 }

	}

}
