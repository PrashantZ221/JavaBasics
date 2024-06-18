package Java.ExceptionHandling;

import java.io.IOException;

public class Throws1 {
	
 void method() throws IOException {

	 throw new IOException("Error observed");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Throws1 m = new Throws1();
		try{
			m.method();
		}
		
		catch(Exception e){
			System.out.println(e.toString());
			
		}

		System.out.println("Rest of code");
	}

}
