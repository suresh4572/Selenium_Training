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
		 System.out.println("First approach");
    System.out.println("a :"+ a);
    System.out.println("b :"+b);
    
    // Approach 2:
   int  x=9;
   int  y=10;
     x=x+y; // a=9
     y=x-y; //b=9-5=4
     x=x-y; //a=5
		 System.out.println("Second approach");
     System.out.println("x :"+ x);
     System.out.println("y :"+y);
     
     //Appraoch3:
     int p =7;
     int q=8;
     p=p*q;
     q=p/q;
     p=p/q;
	 System.out.println("Third approach");
     System.out.println("p :"+ p);
     System.out.println("q :"+q);
	}

}
