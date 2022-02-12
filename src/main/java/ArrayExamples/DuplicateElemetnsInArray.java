package ArrayExamples;

public class DuplicateElemetnsInArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,4,6,8,1,9,8};
		
		for(int i=0; i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("  Print Duplicate Elemetns :"+a[i]);
				}
			}
		}

	}

}
