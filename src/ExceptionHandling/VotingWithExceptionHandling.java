package ExceptionHandling;

import java.util.Scanner;

class YoungerAgeException2 extends RuntimeException
{
	YoungerAgeException2(String msg)
	{
		super(msg);
	}
}

class VotingWithExceptionHandling
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you age");
		int age = s.nextInt();
		try
		{
			if(age < 18)
			{
				throw new YoungerAgeException2("You are not eligible for voting");
			}
			else
			{
				System.out.println("Voting success");
			}
		}
		catch(YoungerAgeException2 e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Exception is handled in this program");
	}
}

