package Java.ExceptionHandling;

class ArithmeticException2 extends RuntimeException {
	ArithmeticException2(String msg) {
		super(msg);
	}
}

public class Throw {
	
	static void result(int marks)
	{
		if(marks<35)
		{
			System.out.println("I am in if exeption");
			throw new ArithmeticException2("Failed in math");   //compulsary throw an exception
		}														
		
		else
		{
			System.out.println("In else part");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result(33);
		System.out.println("Rest of code");

	}

}
