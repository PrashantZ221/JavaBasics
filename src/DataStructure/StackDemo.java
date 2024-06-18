import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack s = new Stack(); //Initial capacity 10
		s.push("aaa");
		s.push("bbb");
		s.push("ccc");
		s.push("ddd");
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek()); //Just returns top element  but does not removes
		System.out.println(s);
		
		System.out.println(s.search("aaa"));
		//Returns -1 if object not present in search
		
		System.out.println(s.empty());
	}

}

/* OUTPUT
[aaa, bbb, ccc, ddd]
ddd
[aaa, bbb, ccc]
ccc
[aaa, bbb, ccc]
3
false
*/


