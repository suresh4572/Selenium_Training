package StringExamples;

public class StaticMethod_StaticBlock {

	public static int empno;
	static String empname;
	static String empdept;

	int a = 12;

	// static blocks are used to initialize static variables

	static {

		empno = 10;
		empname = "suresh";
		empdept = "hr";
		System.out.println(" I am in  second static block");

	}
	static {
		empno = 6;
		empname = "babu";
		empdept = "private";
		System.out.println(" I am in static block");
	}

	static void staticMethod() {

		System.out.println("Employee Number : " + empno);
		System.out.println("Employee Name :" + empname);
		System.out.println("EmployeDept: " + empdept);
	}

	public void normalMethod() {

		System.out.println("Normal method variable is :"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticMethod();

		StaticMethod_StaticBlock obj = new StaticMethod_StaticBlock();
		obj.normalMethod();
	}

}
