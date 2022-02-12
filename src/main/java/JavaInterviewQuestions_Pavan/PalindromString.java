package JavaInterviewQuestions_Pavan;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="MADAM";
		String rev ="";
		
		int len =str.length();
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev)) {
			
			System.out.println(str + ":: String is Pallindrom");
		}else {
			
			System.out.println(str+ "::String is Notpallindrom");
		}

	}

}
