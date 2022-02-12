package JavaInterviewQuestions_Pavan;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Java   is programming language";
		System.out.println("Brfore removing white spaces::"+str);
		
		String s1 =str.replaceAll("\\s", "");
		System.out.println("After removing the white spaces::"+s1);
		
		

	}

}
