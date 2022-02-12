package JavaOops;

public class CallingMethodOverridingExampleBank extends  MethodOverridingExampleBank {
	
	
	int getRateOfInterest() {
		return 7;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CallingMethodOverridingExampleBank obj = new CallingMethodOverridingExampleBank();
		 System.out.println(  " Rate of Interest of SBI is : " + obj.getRateOfInterest());
		 
		
		
	}

}
