package JavaInterviewQuestions_Pavan;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "suresh";
		int count=0;
		for(int i=0;i<s.length();i++) {

			if(s.charAt(i)=='e') 
			{
				count =count+1;

			}


		}
		System.out.println("countchar occures "+count);
		System.out.println("**#*#*#*#*#*#*");

		//	Approach2:


		int totalcount =s.length();
		int totalcount_afterRemove =s.replace("s", "").length();
		int 	count1 = totalcount-totalcount_afterRemove;
		System.out.println("countchar occures "+count1);


	}
}