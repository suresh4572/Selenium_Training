package StringExamples;

public class FinalVariableInConstructor {
	
	//Blank final variable
	
	final int MAX_VALUE;
	
	FinalVariableInConstructor()
	{
		
		//It must be initialized in constructor
		MAX_VALUE=100;
	}
	void myMethod() {
		
		System.out.println(MAX_VALUE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FinalVariableInConstructor obj = new FinalVariableInConstructor();
		obj.myMethod();
	}

}
