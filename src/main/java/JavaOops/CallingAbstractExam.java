package JavaOops;

public class CallingAbstractExam extends AbstractExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingAbstractExam obj = new CallingAbstractExam();
		obj.bodyColor();
		obj.engine();
		obj.safetyGuidelines();
		

	
}

	@Override
	void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println(" red color");
	}

	
}

	

