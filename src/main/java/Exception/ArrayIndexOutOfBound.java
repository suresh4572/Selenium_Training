package Exception;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			try {
				int b[]=new int[7];
				//Array have only 7 elements
				 b[9]=10;
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println("ArrayIndexOutOfBounds Exception...");
			}
	

	}

}
