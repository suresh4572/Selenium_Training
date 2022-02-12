package StringExamples;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=4;
		int b=5;
		int temp;
		 temp =a;
		 a=b;
		 b=temp;
    System.out.println("a :"+ a);
    System.out.println("b :"+b);
    
    // Approach 2:
     a=a+b; // a=9
     b=a-b; //b=9-5=4
     a=a-b; //a=5
		 System.out.println("Second approach");
     System.out.println("a :"+ a);
     System.out.println("b :"+b);
	}

}
