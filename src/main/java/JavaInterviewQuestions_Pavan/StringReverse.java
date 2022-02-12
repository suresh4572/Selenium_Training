package JavaInterviewQuestions_Pavan;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "suresh";
		String rev ="";
	
	/*int len =str.length();  // 6
		
	  for(int i=len-1;i>=0;i--)
		  {
		  
		  rev=rev+str.charAt(i);
		  
		  }
	  System.out.println("Reverse string is :"+rev);
	 System.out.println("****************");
	  
	  */
	  //Approach2:-->Using character array
	 
	  /* char a[] =str.toCharArray();
	  int length = a.length;
	  for(int i= length-1;i>=0;i--)
	  {
		  
		  rev =rev+a[i]; //hserus
	  }
	  
	  System.out.println("Reverse string is :"+rev);
	  
	  System.out.println("****************");
	  */
	  //Appraoch3:Using stringBuffer class
	  
	  StringBuffer sb = new StringBuffer(str);
	 StringBuffer rev1 = sb.reverse();

	  System.out.println("Reverse string is :"+rev1);
	}

}
