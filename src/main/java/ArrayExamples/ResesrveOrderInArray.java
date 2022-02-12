package ArrayExamples;

public class ResesrveOrderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 5,8,9,1,0};
		
		for( int i=0;i<a.length;i++) {
			
			System.out.println( "Print original order of Array :" +a[i]);
		}
		
		
		System.out.println("");
		//Print reverse order in array
		for(int j=a.length-1;j>=0;j--) {
			
			
			System.out.println("Print reverse order in Array :" +a[j]);
		}

	}

}
