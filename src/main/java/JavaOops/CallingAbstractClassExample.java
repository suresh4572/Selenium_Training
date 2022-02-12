package JavaOops;

public class CallingAbstractClassExample extends AbstractClassExample
{
	
	//child class Constructor 
	CallingAbstractClassExample()
	{
		System.out.println(" Child class constructor");
	}
	// Child class instance method
    void msg()
    {
    	System.out.println(" Child class Instance method");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallingAbstractClassExample obj  = new CallingAbstractClassExample();
		// Child Class instance method
		obj.msg();
		 // Super Class final method
		obj.m1();
		//Super class instance method
		obj.me();
		// Super class static method
      obj.m3();
		// super class instance variable
		System.out.println(obj.x);
	}

}
