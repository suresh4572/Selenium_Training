package StringExamples;

public class CharCountInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String s = "suresh java programing";
		int a= s.length(); // total length of string
		int b= s.replace("a", "").length(); // total length after removing "a"
		 
		 int count = a-b;
		 System.out.println(" Numbers occuers  a is :"+count);
		
}
}