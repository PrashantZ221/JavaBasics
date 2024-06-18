import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {
	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		t.add(40);
		t.add(30);
		t.add(60);
		t.add(10);
		//t.add(null); //Cannot add null value
		//t.add("Prash"); //Cannot add diff data types
		//t.remove(30); //Removes given element
		//t.clear() ; //Deletes all elements
		System.out.println(t);
		
	}

}

/* OUTPUT
[10, 30, 40, 60]
*/


