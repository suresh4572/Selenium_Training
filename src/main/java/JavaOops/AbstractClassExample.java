package JavaOops;

public abstract class AbstractClassExample {
	
	int x =10; // Data member
	//constructor
	AbstractClassExample(){
		System.out.println("AbstrctClass constructor");
	}
	
	// Final keyword method
     final void m1()
     {
    	 System.out.println("Final method");
     }
    // Instance method
     void me()
     {
    	 System.out.println(" Instance method");
    	 
     }
     
    // static method
     
     static void m3()
     {
    	 System.out.println("Static method");
     }
     
     //abstract method
     abstract void msg();
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
