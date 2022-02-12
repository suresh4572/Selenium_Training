package JavaInterviewQuestions_Pavan;

public class MinValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {50,100,40,20,60};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]<min) {
				
				min=a[i];
			}
		}
		System.out.println(" The min value is ::"+min);
	}

}
