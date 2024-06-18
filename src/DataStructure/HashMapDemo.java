import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap m = new HashMap(); //Default capacity is 16 and load factor is 0.75
		//HashMap m = new HashMap(Map m2); //Stores value of other map object
		//HashMap m = new HashMap(20); //Capacity is 20
		//HashMap m = new HashMap(20, 0.8); //Capacity 20, load factor 0.8
		m.put(101, "Prashant");
		m.put(102, "Deepak");
		m.put(103, "Akshay");
		System.out.println("In Map" + m);

		Set set = m.entrySet();
		System.out.println("In Set" + set);

		System.out.println("----Iterator-----");
		
		Iterator itr = set.iterator();
/*		while(itr.hasNext()){
			System.out.println(itr.next());
		}
*/
		System.out.println("Seperating key and value");
		while(itr.hasNext()){
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
	}

}

/* OUTPUT
In Map{101=Prashant, 102=Deepak, 103=Akshay}
In Set[101=Prashant, 102=Deepak, 103=Akshay]
----Iterator-----
Seperating key and value
101,Prashant
102,Deepak
103,Akshay
*/


