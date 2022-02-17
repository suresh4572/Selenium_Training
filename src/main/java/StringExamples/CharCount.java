package StringExamples;

import org.checkerframework.checker.units.qual.s;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "suresh";
		int count=0;
/*
		for(int i=0;i<=str.length()-1;i++) {
			
			if(str.charAt(i)=='s') {

				count++;
			}
		}
		System.out.println(count);
	}
		*/
		//Approach2:
		int a =str.length();
		int b =str.replaceAll("s", "").length();
		int count1 = a-b;
		System.out.println(count1);
	}
}