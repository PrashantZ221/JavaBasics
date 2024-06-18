class StringMethods6 {
	public static void main(String[] args)
	{
		String s1 = "Prashant";
		System.out.println("String is: " + s1);
		
		System.out.println(s1.toUpperCase()); //PRASHANT
		System.out.println(s1.toLowerCase()); //prashant
		
		int a = 10, b = 20;
		System.out.println("a and b are integars: ");
		System.out.println(a + b);
		String s2 = String.valueOf(a); 
		String s3 = String.valueOf(b); 
		System.out.println("a and b are now string" + s2 + s3);
		
		char[] c = s1.toCharArray();
		System.out.println(c);
		
		
	}
	
}