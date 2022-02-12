package StringExamples;

public class PallindromeExmple {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="madam";
		String rev="";
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 rev = rev+s.charAt(i);
			 
		 }
		 if(rev.equalsIgnoreCase(s))
		 {
			 System.out.println("  The Result is :: Pallindrome");
		 }
		 else
		 {
			 System.out.println(" The Result is ::Not Pallindome");
		 }

	}

}
