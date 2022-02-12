package ArrayExamples;

public class SinlgeTonClassExample {
	
	private static SinlgeTonClassExample obj = null;
	 private SinlgeTonClassExample() {
		 
		 
	 }
	 public static SinlgeTonClassExample objectCrationMethod()
	 {
		 
		 if(obj == null);
		 {
			 obj =  new SinlgeTonClassExample();
			 
		 }
	 
		 return obj;
	 }
	 public void display() {
		 
		 System.out.println(" Sibgleton Class Example");
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
