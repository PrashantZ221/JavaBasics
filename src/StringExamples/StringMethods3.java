package StringExamples;

class StringMethods3 {
	public static void main(String[] args) {
		
		// + operator, concat(), join(), subSequence(), substring()
		
		String s1 = "Prashant";
		String s2 = "Agarwal";
		System.out.println("s1: "+ s1 + "\ns2: " + s2);
		System.out.println(s1 + s2);
		System.out.println(s1 + 10 + 20); //Prashant1020
		System.out.println(10 + 20 + s1); //30Prashant
		System.out.println(10 + s1 + 20); //10Prashant20
		System.out.println(s1 + 20/10);	  //Prashant2
		//System.out.println(s1 + 10 - 5);  //Error
		
		System.out.println("Concatenated String is: " + s1.concat(s2));
		
		System.out.println("Using Join: " + String.join(" ", s1, s2));
		System.out.println("Using Join: " + String.join(" ", s1, "Mahesh", s2));
		
		String s3 = "012345678";
		System.out.println("s3: " + s3);
		System.out.println("SubSequence of s3 from 1 - 4: " + s3.subSequence(1, 4)); //123

		//CharSequence test = s3.subSequence(1, 5);
		
		System.out.println("Substring of s3 from index 2: " + s3.substring(2)); //2345678
		System.out.println("Substring of s3 from  2 - 6: " + s3.substring(2, 6)); //2345
		//System.out.println(s3.substring(2, -6)); //Error
		//System.out.println(s3.substring(2, 16)); //Error
		System.out.println(s3.substring(0, 0)); //Empty string
	}
}