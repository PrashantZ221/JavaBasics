class StringMethods4 {
	public static void main(String[] args){
		
		String s1 = "This is demo";
		System.out.println("s1: " + s1);
		System.out.println("Replace is by was: " + s1.replace("is", "was")); //Thwas was demo
		
		System.out.println("Replace first is by was: " + s1.replaceFirst("is", "was")); 
		//Thwas is demo
		
		System.out.println("ReplaceAll is by was: " + s1.replaceAll("is", "was")); 
		//Thwas was demo

		System.out.println("ReplaceAll is(.) by was: " + s1.replaceAll("is(.)", "was")); 
		//Thwaswasdemo

	
	}
}