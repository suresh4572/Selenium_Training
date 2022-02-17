package StringExamples;

public class FinalKeyWord {
	final int Max_Value=99;
	int a;
	void myMethod() {
		
		//We can't change value for final variable
	 //Max_Value=101;
		a=100;
		System.out.println(Max_Value);
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyWord obj = new FinalKeyWord();
		obj.myMethod();

	}

}
