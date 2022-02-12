package JavaOops;

 public  class EncapsulaltionExample {
	 
	 // declare  instance variable as string
	 private String name;
	 
	 // Getter method
	 public String getName() {
		 
		 return name;
	 }
	
	//setter
public void setName(String newName) {
	
	this.name = newName;
	
}

  public static void main(String[] args) {
	  
	  EncapsulaltionExample obj = new EncapsulaltionExample();
	  obj.name = "Suresh";
	  System.out.println(obj.name);
	  
  }
 }


