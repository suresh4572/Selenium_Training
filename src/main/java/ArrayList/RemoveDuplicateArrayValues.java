package ArrayList;

import java.util.ArrayList;

public class RemoveDuplicateArrayValues {
	
	
	public void removeDuplicateArrayValues() {
		
		ArrayList array1= new ArrayList();
		array1.add("A");
		array1.add("B");
		array1.add("C");
		
		ArrayList array2= new ArrayList();
		array2.add("A");
		array2.add("D");
		array2.add("E");
		
		//Print arraylist values
		
		System.out.println(" Printing first arraylist  values :"+array1);
		System.out.println(" Printing first arraylist  values :"+array2);
		
		//retainAll  is used to print only the common values in both the arraylists
		array2.retainAll(array1);
		
		System.out.println("Printing common values in both the arraylists bu using retainAll: "+array2);
		
		
		//if user wants to completely clear the arraylit values
		array2.clear();
		System.out.println(" Second ArrayLIst is completely clear :"+ array2);
		
		//Removing Single element from arraylist
		
		array1.remove("C");
		System.out.println(" Removed one element from First Arraylist and printing the rest of values :"+array1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateArrayValues obj = new  RemoveDuplicateArrayValues();
		obj.removeDuplicateArrayValues();
		

	}

}
