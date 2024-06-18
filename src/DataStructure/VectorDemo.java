import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector(); //Initial capacity 10
		//Vector v = new Vector(v1) //Stores v1 in v
		//Vector v = new Vector(6) //Capacity is 6
		//Vector v - new Vector(6, 3) //Capacty is 6 and then capacity increases 4 times instead of double after capacity is full
		v.add("Prashant");
		v.add(1, "Agarwal");
		v.addElement(3);

		System.out.println(v);

		System.out.println(v.firstElement()); //returns first element
		System.out.println(v.lastElement()); // returns last element
		v.removeElement(3); //removes object with value 3
		v.removeElementAt(1); //Removes at index2
		System.out.println(v);
		
		System.out.println(v.capacity());
	}

}

/* OUTPUT
[Prashant, Agarwal, 3]
Prashant
3
[Prashant]
10
*/


