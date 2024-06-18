import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(101, "Prashant");
		m.put(102, "Deepak");
		m.put(103, "Akshay");

		//m.clear()  // Deletes all entries
		System.out.println(m);
		System.out.println(m.containsKey(103));
		System.out.println(m.containsValue("Prashant"));
		System.out.println(m.get(102));
		//m.remove(102); //Removed entry with key 102
		m.replace(101, "PrashantReplace");
		System.out.println(m.size());
		System.out.println("---------------");
		m.put(101, "Test"); //Replaces 101 value
		
		m.put(null, null);
		System.out.println(m);
		
	}

}

/* OUTPUT
{101=Prashant, 102=Deepak, 103=Akshay}
true
true
Deepak
3
---------------
{null=null, 101=Test, 102=Deepak, 103=Akshay}
*/


