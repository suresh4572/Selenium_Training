package Exception;

public class StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a =" This is like chipping ";//length is 22
			char c = a.charAt(24);//Accessing 25th element
			System.out.println(c);
			
		}
		 catch(java.lang.StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException...");
		}
		

	}

}
