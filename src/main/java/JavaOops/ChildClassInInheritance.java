package JavaOops;

public class ChildClassInInheritance  extends  InheritanceExaple{

	
	
	public void engine() {
		
		System.out.println(" New version of Engine");
	}
	
	public void  color () {
		
		System.out.println( color );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         		
		ChildClassInInheritance Cd = new ChildClassInInheritance();
		Cd.color();
		Cd.breaks();

	}

}
