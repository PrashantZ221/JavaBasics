import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(10);  //Stores in 0th index, can also write l.add(0, 10)
		l.add(20);
		l.add(30);
		l.add(30); //Stores duplicate value		
		l.add(null);
		l.add(null); //Can store duplicate null values
		System.out.println(l);
		//l.set(0, 2);

		Iterator itr = l.iterator();
		while (itr.hasNext())  //hasNext returns boolean
		{
			System.out.println(itr.next());
		}

		ListIterator litr = l.listIterator();
		while (litr.hasNext())  //hasNext returns boolean
		{
			System.out.println(litr.next());
		}
	}
}

/* OUTPUT
[10, 20, 30, 30, null, null]

10
20
30
30
null
null

10
20
30
30
null
null
*/