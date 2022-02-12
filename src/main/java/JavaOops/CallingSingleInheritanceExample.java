package JavaOops;

public class CallingSingleInheritanceExample  extends SingleInheritanceExample{

	public void print_for() {
		System.out.println(" for");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallingSingleInheritanceExample obj = new CallingSingleInheritanceExample();
		 
		obj.print_geek();
		obj.print_for();
		 obj.print_geek();
	}

}
