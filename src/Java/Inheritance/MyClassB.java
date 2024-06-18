package Inheritance;

public class MyClassB extends MyClassA{
	
	public void methodChild()
	{
		System.out.println("This is method in child class");
	}
	
	public void parent1() {
		System.out.println("This is overridden method for parennt1");
	}
	
	public static void main(String args[])
	{
		MyClassB obj = new MyClassB();   //Object of child class
		obj.methodChild();
		obj.parent1();   //Inherited from parent class		
		obj.parent3();
		
		//To access the method of parent class which is overridden in child class
		MyClassA obj2 = new MyClassA();
		obj2.parent1();
		
		MyClassA obj3 = new MyClassB();
		//obj3.methodchild();  Cannot access method in child class with object of parent class  
		obj3.parent1();
		obj3.parent3();
		
		//MyClassB obj4 = new MyClassA();  - Cannot create object of child class and give reference of parent class
		
	}
	
	

}
