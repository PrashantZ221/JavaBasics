import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(300); // Duplicate value not stored, value stored only once
		s.add(null);
		s.add(null); // Duplicate null vaue not stored, value stored only once
		System.out.println(s);

		//Result is not displayed in order as in List

		Iterator itr = s.iterator();
		while (itr.hasNext())  //hasNext returns boolean
		{
			System.out.println(itr.next());
		}
	}
}

/*  OUTPUT
[null, 100, 200, 300]
null
100
200
300


*/