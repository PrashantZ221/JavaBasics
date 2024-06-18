package InterviewProg;


public class PrimeNumbers {

	public boolean primeNum(int num)
	{
		
		if(num<0)
		{
			System.out.println("Number should be greater than 0");
			throw new ArithmeticException();
		}
		
		else
		{
		
			if(num%2==0)
			{
				return true; 
			}
			
			else
			{
				for(int i=3; i<num/2; i++)
				{
					if(num%i==0)
					{
						return true;
					}
				}							
			}						
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeNumbers obj = new PrimeNumbers();
		
		int num = 49;
		boolean result = obj.primeNum(num);
	
		if(result == true)
		{
			System.out.println(num+" is a composite number");
		}
		
		else
		{
			System.out.println(num+" is a prime number");
		}
	}
}