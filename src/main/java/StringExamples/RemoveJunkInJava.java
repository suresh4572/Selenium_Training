package StringExamples;

public class RemoveJunkInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s = " #$%%^^^^^&&& junk string 12244";
   
    System.out.println( s.replaceAll("[^a-zA-Z0-9]", ""));
   
	}

}
