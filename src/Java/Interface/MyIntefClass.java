package Interface;

//public class MyIntefClass implements Vehicle, Ships {   //multiple inheritance
 
	
public class MyIntefClass implements Vehicle {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("This is move overriden method");
		
	}

	@Override
	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println("This is mileage overriden method");
		
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("This is wheel overriden method");
		
	}

	@Override
	public void WithoutWheels() {
		// TODO Auto-generated method stub
		System.out.println("This is without wheels overriden method");
		
	}

	
}
