package oopsConcepts;

public class MultipleConstructors {
	public MultipleConstructors() {
		// Default Cons.
		System.out.println("From Default MultipleConstructors Cons.");
	}
	
	public MultipleConstructors(int a) {
		System.out.println("From int 1 MultipleConstructors Cons.");
	}
	
	public MultipleConstructors(String str) {
		System.out.println("From String MultipleConstructors Cons.");
	}
	
	public MultipleConstructors(int a, int b) {
		System.out.println("From multi Int MultipleConstructors Cons.");
	}
}
