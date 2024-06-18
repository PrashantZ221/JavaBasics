import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

//There are 3 cursors - Iterator, ListIterator, Enumeration

public class ItrDemo
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(10);
		l.add("Prashant");
		l.add("Agarwal");
		System.out.println(l);

		Iterator itr = l.iterator();
		while (itr.hasNext())  
		{
			System.out.println(itr.next());
		}
		
		l.remove("Prashant"); //Removes the element
		System.out.println(l);
	}
}

/* OUTPUT

[10, Prashant, Agarwal]
10
Prashant
Agarwal
[10, Agarwal]
*/