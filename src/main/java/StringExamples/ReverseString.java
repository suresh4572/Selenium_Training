package StringExamples;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a = "suresh";
		String reverse ="";
		/*for(int i=a.length()-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
			
		}
		
		System.out.println("rever string is :"+reverse);*/
	
		// Approach: By Using String Buffer class
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();
		
		System.out.println(" Reverse of String  Buffer classis  :"+ sb.reverse());

	}

}




