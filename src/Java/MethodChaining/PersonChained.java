package MethodChaining;

public class PersonChained {

	private int age;
	private String name;
	
	public PersonChained setName(String myName)
	{
		name = myName;
		return this;
	}
	
	public PersonChained setAge(int myAge)
	{
		age = myAge;
		return this;
	}
	
	public PersonChained display()
	{
		
		System.out.println("My name is "+name+ " and my age is "+age);
		return null;
	}
	
	public static void main(String[] args) {
		
		PersonChained obj = new PersonChained();
		obj.setName("Peter").setAge(25).display();
		
	}

}
