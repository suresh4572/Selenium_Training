package HashSetExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hashset, TreeSet, LinkedHashSet impliments Set interface
		//does not accept duplicte values
		// There is no guarantee  elements stored in sequential order
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("USA");
		hs.add("INDIA");
		hs.add("CANADA");
		hs.add("INDIA");
System.out.println(hs);
hs.remove("UK");
hs.isEmpty();
hs.size();
System.out.println(hs);

 Iterator<String> i=  hs.iterator();
 while(i.hasNext())
 {
	 System.out.println(i.next());
 }

	}

}
