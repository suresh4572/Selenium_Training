package StringExamples;

public class StringManuplationProgram {
	
	String name ="BalaSureshBabu";
	
	public void stringMethod()
	{
		
	System.out.println("Printing specific character by passing index number: "+	name.charAt(6));
	System.out.println(("Printing specific index by passing character number "+name.indexOf("u")));
	System.out.println(("String Starting character: "+name.startsWith("s")));
	System.out.println("String ending character:" +name.endsWith("u"));
	System.out.println(name.equals("suresh"));
	System.out.println(name.equalsIgnoreCase("suresh"));
	System.out.println(name.toUpperCase());
   System.out.println(name.toLowerCase());
   System.out.println(name.length());
	System.out.println(name.trim());

	
	System.out.println(name.substring(4));
	System.out.println(name.substring(4, 10));
	}
	
	String  name2="My name is ";
	public void SringValidMethod()
	{
		
		System.out.println(" Length of String :"+name2.length());
		System.out.println("UpperCase of String :" +name2.toLowerCase());
		System.out.println("LowerCase of String :"+name2.toLowerCase());
		System.out.println("Printitng Specific index by passing index number :"+name2.indexOf("a"));
		System.out.println("Printing specific  character by passing the character :"+name2.charAt(5));
		System.out.println("String ending character :"+name2.endsWith("i"));
		System.out.println("String starting charcter : "+name2.startsWith("s"));
		System.out.println("Printing the sub string by passing the stratting integer :"+name2.substring(9));
	   System.out.println("Replacing the old character with new character :"+name2.replaceAll("a", "A"));
	   System.out.println("Pringting the last index of s value :"+name2.lastIndexOf("s"));
	   System.out.println("Comparing the string with another string :"+ name2.compareTo("suresh babu"));
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManuplationProgram obj = new StringManuplationProgram();
		obj.stringMethod();
		obj.SringValidMethod();

	}

}


