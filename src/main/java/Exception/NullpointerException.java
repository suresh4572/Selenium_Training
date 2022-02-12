package Exception;

public class NullpointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a = null;//null value
			System.out.println(a.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException..");
		}

	}

}
