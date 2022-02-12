package StringExamples;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String a="Hello";
		  String b="world";
		  
		  
		  // 1.append  a and b:
		  a=a+b; //HelloWorld
		  //2. Stroe initial string value in string b
		  
		  b=a.substring(0, a.length()-b.length()); //Hello
		  // 3.Store initial string b in string a:
		  
		  a=a.substring(b.length());  //world
		  
		  System.out.println(" The value of a is :"+a);
		  System.out.println(" The value of b is :"+b);
		  
	}

}
