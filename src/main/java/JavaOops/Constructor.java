package JavaOops;

public class Constructor {
	
	String name;
	//Constructor
	
	Constructor(){
		
		this.name ="Hello world";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj  = new Constructor();
		System.out.println(obj.name);

	}

}
