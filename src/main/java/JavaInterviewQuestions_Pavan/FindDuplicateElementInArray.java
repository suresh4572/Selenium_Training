package JavaInterviewQuestions_Pavan;

import java.util.HashSet;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"java","phyton","c++","ruby","Java"};
		//Approach 1:
	/*	
		boolean flag =false;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					
					System.out.println(" found duplicate element::"+a[i]);
					flag=true;
				}
			}
			}
		if(flag==false) {
			System.out.println(" Duplicate Element Not Found");
		}

	}
	*/
	//Approach 2: using Hashset
	
	String b[]= {"java","phyton","c++","ruby","java"};
	
	HashSet<String> hs = new HashSet();
	boolean flag =false;
	for(String l :b)
	{
		
		if(hs.add(l)==false) {
			
			System.out.println(" Found duplicate Number ::"+l);
			flag=true;
		}
	}if(flag==false) {
		
		System.out.println(" No Duplcate element found");
	}
	
	}

}
