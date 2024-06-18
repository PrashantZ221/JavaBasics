package MethodChaining;

class PersonUnchained {
	private String name;
	private int age;

	// Per normal Java style, the setters return void.

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void introduce() {
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	}

	// Usage:
	public static void main(String[] args) {
		PersonUnchained obj = new PersonUnchained();
		// Not using chaining; longer than the chained version above.
		// Output: Hello, my name is Peter and I am 21 years old.
		obj.setName("Peter");
		obj.setAge(21);
		obj.introduce();
	}
}