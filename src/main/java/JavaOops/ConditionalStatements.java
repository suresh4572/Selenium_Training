package JavaOops;

public class ConditionalStatements {

	int a = 100;

	// Simple if statement method
	public void ifStmtMethod() {

		if (a == 100) {

			System.out.println("Passed");
		}
	}

	// NestedIf Statement method
	public void nestedIfMethod() {
    	
	int x = 30;
	int y =20;
	
	
	if(x==30) {
		
		if(y==20) {
			
			System.out.println(" x= 30 and y =20");
		}
	 }
	
	}
	 //If else statment method
	
	public void ifElseMethod() {
		
		int b=150;
		
		if(b>=150) {
			
			System.out.println(" b is Passed");
		}
		else {
			
			System.out.println("Failed");
		}
	}
	  //  if else if statement method
	 public void ifElseIfMethod() {
		 
		 int c=50;
		 if(c==150) {
			 
			 System.out.println(" C is equal to 150");
			 
		 }
		 
		 else if(c>150){
			 
			 System.out.println(" C is greater than 150");
			 
		 }
		 else {
			 
			 System.out.println(" C is less than 150");
		 }
	 }
	 
	 // switch program
	 
	 public void switchMethod() {
		 
		 int day=4;
		 switch(day) {
		
		 case 1:
			 System.out.println(" Monday");
			 break ;
		 case 2:
         System.out.println("Tueday");
         break;
		 case 3:
	         System.out.println("wednesday");
	         break;
		 case 4:
	         System.out.println("Thursday");
	         break;
		 case 5:
	         System.out.println("Friday");
	         break;
		 case 6:
	         System.out.println("Saturday");
	         break;
		 case 7:
	         System.out.println("Sunday");
	         break;
		 
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConditionalStatements obj  = new ConditionalStatements();
		
		obj.ifElseIfMethod();
		obj.ifElseMethod();
		obj.ifStmtMethod();
		obj.nestedIfMethod();
		obj.switchMethod();
	}

}
