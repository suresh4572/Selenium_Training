package JavaInterviewQuestions_Pavan;

public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {9,7,11,15,17};
		int max =a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
				
			}
		}
		System.out.println("Maxium value in Array::"+max);
	}

}
