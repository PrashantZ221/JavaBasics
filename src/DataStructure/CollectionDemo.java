package DataStructure;

import java.util.ArrayList;

public class CollectionDemo
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(100); //100 is considered as object and not int
		a1.add("Prashant");
		a1.add('c');
		
		System.out.println(a1);	
		
		ArrayList a2 = new ArrayList();
		a2.add("aaa"); 
		a2.add("bbb");
		a2.add("ccc");
		
		System.out.println(a2);	

		a1.addAll(a2);     //Add all elements of a2 in a1
		
		System.out.println(a1);	

		System.out.println(a2.add("Test"));	//Add method returns true

		System.out.println(a2.contains("Test"));  // TRUE: - If object contains - returns true else false
		System.out.println(a2.contains("ABCD"));  // FALSE
		
		System.out.println(a2.isEmpty());  //FALSE : If object is empty returns true else false
		System.out.println(a1.size());  //Returns number of elements

		a2.remove(1);     //(Method of ArrayList Class)Considers index - Removes element at first index
		// a2.remove("aaa"); //Considers object - Removes mentioned object
		// a2.removeall(a1): //Removes all objects from a2 that are present in a1

		//a2.clear();   //Removes all elements from object

		System.out.println(a2);  
		
	}
}

/* METHODS USED 
a1.add(100)
a1.addAll(a2)
System.out.println(a2.contains("Test"))
System.out.println(a2.isEmpty())
System.out.println(a1.size())
a2.remove("aaa");
a2.clear();
a1.contains("Prashant")  - Will return true if it contains Prashant else false
a1.size() - Gives number of elements
a1.get(3) - Returns element present at index 3
a1.set(2, 88) - Replaces element at index 2 with 88 (Replace)
a1.indexOf("Prashant") - Will give the index value where the element is stored
*/

/*
[100, Prashant, c]
[aaa, bbb, ccc]
[100, Prashant, c, aaa, bbb, ccc]
true
true
false
false
6
[bbb, ccc, Test]
 */