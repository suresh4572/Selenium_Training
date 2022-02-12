package StringExamples;

public class Eachwordreversestring {

	public void reverseEachWord() {
		String inputString = " Iam quick learner";

		String[] spiltString = inputString.split(" ");

		String reverseString = "";

		for (int i = 0; i < spiltString.length; i++) {

			String reverseWord = "";
			String eachWord = spiltString[i];

			for (int j = eachWord.length() - 1; j >= 0; j--) {

				reverseWord = reverseString + eachWord.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		Eachwordreversestring obj = new Eachwordreversestring();
		obj.reverseEachWord();

	}

}
