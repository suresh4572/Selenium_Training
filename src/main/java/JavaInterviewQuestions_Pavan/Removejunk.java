package JavaInterviewQuestions_Pavan;

public class Removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="#*U#u4394u343idmlsdnoru03dm;";
		
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
