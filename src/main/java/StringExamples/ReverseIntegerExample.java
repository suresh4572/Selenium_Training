package StringExamples;

public class ReverseIntegerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =12345;  
		int rev=0;
		while(num!=0) {
			
			rev = rev*10+num%10;  //54
			num =num/10 ;   //123
		}
		
System.out.println("Reverse num is ::"+rev);

  // 2.Using StringBuffer method
long num1=12345;
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
