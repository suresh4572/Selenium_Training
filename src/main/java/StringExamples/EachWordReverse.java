package StringExamples;

class EachWordReverse {
	
	
	public static void main(String[] args) {
		
		String s = " My name is suresh babu";
		String[] words = s.split(" ");
		
		String rev="";
		
		for(int i=words.length-1;i>=0;i--)
		{
			
			rev=rev+words[i]+" ";
		}
		 System.out.println("Reverse each word in String is ::" +rev); 
		 
		
		
		
		
	}
	
	
	

}
