package StringExamples;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "suresh";
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='s')
			{
				count=count+1;
			}
		}
System.out.println(" Count of chars :"+count);
	}

}
