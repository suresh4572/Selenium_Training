package JavaOops;

public final class CallingAbstractionClassExample3 extends AbstractionClassExample3 {

	// Child class constructor
	public CallingAbstractionClassExample3(String name, int id) {

		// Accesing super/parent class constructor with the help of super keyword
		super(name, id); // This statement is to call super class constructor

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an object of the subclass of abstract class
		CallingAbstractionClassExample3 obj = new CallingAbstractionClassExample3("Suresh",4572);
		obj.m1();
	}

}
