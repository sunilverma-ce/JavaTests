package oopsConcepts;

public class MultipleConstructors {
	// Default Cons.
	public MultipleConstructors() {
		System.out.println("From Default MultipleConstructors Cons.");
	}

	// Constructor with one int parameter
	public MultipleConstructors(int a) {
		System.out.println("From int 1 MultipleConstructors Cons.");
	}

	// Constructor with one String parameter
	public MultipleConstructors(String str) {
		System.out.println("From String MultipleConstructors Cons.");
	}

	// Constructor with two int parameters
	public MultipleConstructors(int a, int b) {
		System.out.println("From multi Int MultipleConstructors Cons.");
	}
}
