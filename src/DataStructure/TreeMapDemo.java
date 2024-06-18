import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap m = new TreeMap(); 
		m.put(106, "Prashant");
		m.put(103, "Agarwal");
		m.put(107, "Kamal");
		m.put(102, "Deepak");
		m.put(108, "Rahul");
		m.put(101, "Ravi");
		System.out.println(m); //Sorts as per key

		System.out.println("Entry for 103 key:" + m.ceilingEntry(103));
		System.out.println("Entry for 104 key which is not present - give next entry" + m.ceilingEntry(104));		

		System.out.println(m.keySet()); //Returns all keys		

		//m.clear();  //Clears all entries
		
		//m.containsKey(104);  //Returns true if present or false	
		//m.firstEntry();  //Gives first entry	
	
		//m.get(103);      //Gives value for entered key, returns null if not present
	
		//m.headmap(102);  //Need to check - also diff between headmap and firstEntry

		//m.higherEntry(102);  // returns greater than the mentioned key, returns null if not found
	
		//m.pollFirstEntry(); //Removes first entry

		//m.remove(102); //Removes entry with key 102

		//m.replace(102, "aa"); //Replaces value of 102 key

		//m.size(); //total nuber of entries

		//m.submap(103, 107)  //returns entry between the 2 mentioned keys - from 103 inclusive to less than 107
	}

}

/* OUTPUT
{101=Ravi, 102=Deepak, 103=Agarwal, 106=Prashant, 107=Kamal, 108=Rahul}
Entry for 103 key:103=Agarwal
Entry for 104 key which is not present - give next entry106=Prashant
[101, 102, 103, 106, 107, 108]
*/


