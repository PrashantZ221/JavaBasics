import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListItrDemo
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(10);
		l.add("Prashant");
		l.add("Agarwal");
		System.out.println(l);

		ListIterator litr = l.listIterator();
		while (litr.hasNext())  
		{
			System.out.println(litr.next());
		}


		System.out.println("--------------");

		while (litr.hasPrevious())  
		{
			System.out.println(litr.previous());
		}

		litr.add(100);  //ListIterator can Add, remove, Set
		System.out.println(l);

		litr.next(); //Cursor will be at 10
		litr.set(200); //Will replace the element where cursor is present
		System.out.println(l);
	}
}

/* OUTPUT

[10, Prashant, Agarwal]
10
Prashant
Agarwal
--------------
Agarwal
Prashant
10
*/
