package StringExamples;

class StringConstructors{
	public static void main(String[] srgs) {

		String s1 = new String();  					//No parameter constructor
		System.out.println(s1.length());
		
		String s2 = new String("Prashant"); 		//Parameterized constructor
		System.out.println(s2.length());
		
		StringBuffer sbf = new StringBuffer("StringBuffer"); //Creates mutable objects
		String s3 = new String(sbf);				//StringBuffer constructor
		System.out.println(sbf);
		
		StringBuilder sbd = new StringBuilder("StringBuilder"); //Creates mutable objects
		String s4 = new String(sbd);				//StringBuilder constructor
		System.out.println(s4);
		
		byte[] b = {101, 102, 103};
		String s5 = new String(b);					//Byte constructor
		System.out.println(b);
		System.out.println(s5);
		
		char[] ch = {'a', 'b', 'c'};
		String s6 = new String(ch);					//Char constructor	
		System.out.println(s6);
		System.out.println(ch);						//prints abc
				
	}

	
}