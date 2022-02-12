package ArrayList;

import java.util.ArrayList;

public class ArrayListPgm {

	// Create ArrayList & Add elements
	public void createArrayList() {

		// create ArrayList
		ArrayList<String> languages = new ArrayList<String>();

		// Add elements to Array

		languages.add("Java");
		languages.add("Python");
		languages.add("Swift");
		languages.add("123");
		languages.add("987");
		System.out.println("  Print Create ArrayList  Values:" + languages);

	}

	// Access ArrayList Elements
	public void accessArrayListElements() {

		ArrayList<String> animals = new ArrayList<String>();

		// add elements in the arraylist

		animals.add("Cat");
		animals.add("Dog");
		animals.add("Cow");

		System.out.println(" Print Access ArrayList Values :" + animals);

		// get the element from the arraylist
		String str = animals.get(1);
		System.out.println("Get Element at index 1:" + str);
	}

	// Change ArrayListElements
	public void changeArrayList() {
		ArrayList<String> languages = new ArrayList<String>();

		// add element in the array list
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("C++");
		System.out.println(" Print Change ArrayList Values :" + languages);

		// change the element of the ArrayList
		languages.set(2, "JavaScript");
		System.out.println(" Print  Modified ArrayList :" + languages);

		

	}

	
	// Remove ArrayList Elements
	public void removeArrayList() {

		ArrayList<String> animals = new ArrayList<String>();

		// add elements in the arraylist
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		animals.add(" Print Remove Array List  Values :" + animals);

		// Remove element from index2
		String str = animals.remove(2);
		System.out.println("Updated ArrayList  :" + animals);
		System.out.println("Removed Element :" + str);

	}

	public void mergeTwoArrays() {

		// merge arraylist
		ArrayList list = new ArrayList();
		
		// first arraylist

		ArrayList array1 = new ArrayList();
		array1.add("A");
		array1.add("B");
		array1.add("C");

		list.add(array1);

		// Another list of values for the same arrayist by using another memory

		ArrayList array2 = new ArrayList();
		array2.add("A");
		array2.add("E");
		array2.add("B");
		
		list.add(array2);
		
		System.out.println(list);

		// first arraylist

		ArrayList array3 = new ArrayList();
		array3.add("A");
		array3.add("B");
		array3.add("C");

		ArrayList array4 = new ArrayList();
		array4.add("A");
		array4.add("B");
		array4.add("C");

		array3.add(array4);

		System.out.println(array3);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListPgm obj = new ArrayListPgm();
		obj.createArrayList();
		obj.accessArrayListElements();
		obj.changeArrayList();
		obj.removeArrayList();
		obj.mergeTwoArrays();
	}

}
