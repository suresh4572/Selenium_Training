package JavaInterviewQuestions_Pavan;

import java.util.Arrays;
import java.util.Collections;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class SortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {44,77,88,11,33};
		
		System.out.println("Arrays before sorting :"+Arrays.toString(a));
		
		//Approach1: Arrays sorting
		Arrays.parallelSort(a);
		System.out.println("Arrays after sorting:"+Arrays.toString(a));
		
		//Approach2: Arrays sorting
	//	Arrays.sort(a);
		System.out.println("Arrays after sorting:"+Arrays.toString(a));
		
		//Approach 3: Sorting in descending order
		Integer b[]= {33,77,99,11,55,44};
		System.out.println("Arrays before sorting :"+Arrays.toString(b));
		
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("Arrays after sorting:"+Arrays.toString(b));

	}

}
