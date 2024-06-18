package StringExamples;

class StringMethods2 {
	public static void main(String[] args){
		
	//equals(), equalsIgnoreCase()
	
	String s1 = "Prashant";
	String s2 = "PRASHANT";
	System.out.println("s1:" + s1 + "\ns2:" + s2);
	System.out.println("Is s1 equals to s2: " + s1.equals(s2));
	System.out.println("Is s1 equals to s2 Ignore Case: " + s1.equalsIgnoreCase(s2));
	
	String s3 = null;
	System.out.println("s3:" + s3 );
	//System.out.println(s3.equals("")); //NullPointerException since s3 is null
	
	String s4 = "a"; //decimal value 97
	String s5 = "A"; //decimal value 65
	System.out.println("s4: " + s4 + "\ns5:" + s5);
	System.out.println("Compare of s4 with s5: " + s4.compareTo(s5));
	System.out.println("Compare s4 with s5 by ignoring case: " + s4.compareToIgnoreCase(s5));
	//System.out.println("Comparison with Null" + s4.compareTo(s3)); //Null pointer exeption
	}
}