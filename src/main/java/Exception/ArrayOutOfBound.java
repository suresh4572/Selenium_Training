package Exception;

public class ArrayOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {
			
			int a[]=new int[9];
			//Array have only 7 elements
			 a[11]=10;
		}
	catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("ArrayIndexOutOfBounds Exception...");
		}
}
	
	
	// TODO Auto-generated method stub

}






 