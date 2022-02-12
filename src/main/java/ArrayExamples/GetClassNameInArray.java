package ArrayExamples;

public class GetClassNameInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration and initialization of array
		int arr[] = { 4, 4, 5};

		// getting the class name of java array
		Class c = arr.getClass();
		String name = c.getName();
		
		// printing the class name of the java array

		System.out.println(name);

	}

}
