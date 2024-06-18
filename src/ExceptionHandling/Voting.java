package ExceptionHandling;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException 
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}

class Voting
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you age");
		int age = s.nextInt();
		if(age < 18)
		{
			throw new YoungerAgeException("You are not eligible for voting");
		}
		else
		{
			System.out.println("Voting success");
		}
		System.out.println("Exception handling is not done here");
	}
}

