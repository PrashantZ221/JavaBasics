package DataStructure;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("Prashant");
		hs.add("Prashant"); //will print this value only once
		hs.add(10.44);
		System.out.println("hs: " + hs);
		System.out.println("--------------------");
	
                Iterator itr = hs.iterator();	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}

/* OUTPUT
hs: [10.44, 10, Prashant]
--------------------
10.44
10
Prashant
*/


