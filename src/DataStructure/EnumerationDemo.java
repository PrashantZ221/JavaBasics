package DataStructure;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationDemo
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(10);
		v.add("Prashant");
		v.add("Agarwal");
		System.out.println(v);
		Enumeration e = v.elements();
		while (e.hasMoreElements())  
		{
			System.out.println(e.nextElement());
		}
	}
}

//Enumeration can only be used for old classes - Vector and Stack

/* OUTPUT

[10, Prashant, Agarwal]
10
Prashant
Agarwal
*/
