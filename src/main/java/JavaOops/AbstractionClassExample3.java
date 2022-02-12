package JavaOops;



public abstract class AbstractionClassExample3 
{
	
	private String name;
	
	private int id;
	
	// super class constructor
	
	 public AbstractionClassExample3(String name , int id)
	 {
		 this.name = name;
		 this.id = id;
		 
	 }
	 //Declaration of concrete method
	 void m1()
	 {
      System.out.println(" Name :"+ name);
      System.out.println(" id :"+ id);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
