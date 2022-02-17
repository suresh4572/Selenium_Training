package StringExamples;

public class ReverseEachWordIndString {

	public static void main(String [] args) {

		String s = "java is an programming language"; //Original String 

		String[] words =s.split(" "); // spilting the string in to words

		String reverse_String ="";

		for(String w:words)
		{
			String reverseword ="";

			for(int i=w.length()-1;i>=0;i--) {

				reverseword=reverseword+w.charAt(i);
			}
			reverse_String =reverse_String+reverseword+" ";
	}
		System.out.println(reverse_String);
}

}


