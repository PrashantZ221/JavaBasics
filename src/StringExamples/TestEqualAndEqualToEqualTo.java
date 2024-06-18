package StringExamples;

class TestEqualAndEqualToEqualTo{
	public static void main(String[] args) {
		String S1 = new String("Prashant");
		String S2 = new String("Prashant");
		System.out.println(S1==S2); //False
		System.out.println(S1.equals(S2)); //True
		
		String S3 = "Testing";
		String S4 = "Testing";
		System.out.println(S3==S4); //True
		System.out.println(S3.equals(S4)); //True

	}
}