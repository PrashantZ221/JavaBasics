import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList(); //Empty constructor
		ll.add(0, "Prashant");
		ll.add(1, "Agarwal");
		ll.add(3);
		ll.add('c');
		ll.add('c');
		System.out.println(ll);	

		ll.addFirst("aaa");
		ll.addLast("zzz");
		System.out.println(ll);	

		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);	

		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		LinkedList ll2 = new LinkedList(ll); //Constructor with value		
		System.out.println("ll2:" + ll2);
		
	}

}

/* OUTPUT
[Prashant, Agarwal, 3, c, c]
[aaa, Prashant, Agarwal, 3, c, c, zzz]
[Prashant, Agarwal, 3, c, c]
Prashant
c
ll2:[Prashant, Agarwal, 3, c, c]
*/