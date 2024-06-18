package StringExamples;

class StringMethods {
	public static void main(String[] args){
		
		//length(), isEmpty() and trim() methods
		String s1 = "Prashant";
		System.out.println("String one: " + s1);
		
		System.out.println("String length is " + s1.length());
		System.out.println("String is empty: true/ false: " + s1.isEmpty());
		
		String s2 = "   Agarwal  test   ";
		System.out.println("String two: " + s2);
		System.out.println("Trimmed string is: " + s2.trim());
		
		String s3 = null;
		System.out.println("String three: " + s3);
		//System.out.println("String length is " + s3.length());  //Null pointer exception
				
	}
	
}