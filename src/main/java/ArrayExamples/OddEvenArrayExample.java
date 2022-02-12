package ArrayExamples;

public class OddEvenArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 2,6,7,9,8,11};
		
		System.out.println("Odd Numbers :");
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2!=0) {
				
				System.out.println(a[i]);
			}
		}
		System.out.println("Even Numbers :");
		
for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				
				System.out.println(a[i]);
			}

	}

}}
