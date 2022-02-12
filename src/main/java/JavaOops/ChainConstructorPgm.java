package JavaOops;

public class ChainConstructorPgm {
	
	//No argument/default Constructor
	ChainConstructorPgm()
	{
		System.out.println(" Default constructor");
	}
	// Parametarized Constructor
	ChainConstructorPgm(int x)
	{
		this();
		System.out.println(" One-argument Construcotr");
		System.out.println(x);
	}

	// Constrcutor with two arguments
	ChainConstructorPgm(int x, int y){
		
		this(5);
		System.out.println(" Two arguments construcotrs");
		System.out.println(x*y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChainConstructorPgm obj = new ChainConstructorPgm(6,7);
	
	}

}
