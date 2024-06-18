package Java.ExceptionHandling;

public class MytryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("In try block");
			int i = 10/0;
		}
		
		catch(ArithmeticException ea)
		{
			System.out.println("In catch block 1: "+ ea);
			//ea.printStackTrace();
			
		}
		
		catch(Exception e)
		{
			System.out.println("In catch block 2: "+ e);
		}
		
		//Only one catch block gets executed.
		/*If in first catch parent class is mentioned and in second catch child exception is mentioned
		 then second is irrelevant  */
		//Finally always gets executed and it is optional
		//If exeption is handled, then only the remaining code gets executed		
		
		
		finally
		{
			System.out.println("In finally block");
		}

		System.out.println("Remaining code");
	}

}
