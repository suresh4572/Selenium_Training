package StringExamples;

public class CountTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Java is an Peogramming languge ";
		
		int count=0;
		for(int i=0;i<=s.length()-1;i++) 
		{
			
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
			System.out.println("Count of words in String is :"+count);
			
		}

	}


