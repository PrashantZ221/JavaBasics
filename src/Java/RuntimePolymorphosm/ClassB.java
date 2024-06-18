package RuntimePolymorphosm;

public class ClassB extends RuntimePolymorphosm.ClassA {

	public void method1(int i){
		System.out.println("Override in "+i );
	}

	
	public static void main(String args[]){
		RuntimePolymorphosm.ClassA obj = new ClassB();
		
		obj.method1(50);
	}
}
