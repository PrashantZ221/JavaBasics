class StringMethods5 {
	public static void main(String[] args) {
		String s1 = "Prashant";
		System.out.println("String s1: " + s1);
		
		System.out.println("Index of ra: " + s1.indexOf("ra")); //1
		System.out.println("Index of a: " + s1.indexOf('a'));   //2
		System.out.println("Index of z: " + s1.indexOf('z'));  //Returns -1 (string not found)
		
		System.out.println("Last index of a: " + s1.lastIndexOf("a"));  //5
		
		System.out.println("Char at location 5: " + s1.charAt(5));      //a

		System.out.println("Does s1 starts with P:" + s1.startsWith("P"));    //true
		System.out.println("Does s1 starts with Pr:" + s1.startsWith("Pr"));  //true

		System.out.println("Does s1 ends with P:" + s1.endsWith("P"));    	  //false
	}
}