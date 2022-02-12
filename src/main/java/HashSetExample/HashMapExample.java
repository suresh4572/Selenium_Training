package HashSetExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
         hm.put(0, "hello");
         hm.put(1, "Goodbye");
         hm.put(2, "morning");
         hm.put(3, "evening");
		
	System.out.println(hm.get(2));
	hm.remove(3);
	 

	
		
		
		
	}

}
