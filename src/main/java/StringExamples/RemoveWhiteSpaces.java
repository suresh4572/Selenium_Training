package StringExamples;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "suresh babu bandaru";
		//Approach1:
	String  result =a.replaceAll(" ", "");
	//Approach2:
	String res = a.replaceAll("\\s", "");


		System.out.println(result);
		System.out.println(res);
	
   
	}

}
