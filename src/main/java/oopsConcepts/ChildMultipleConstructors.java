package oopsConcepts;

/**
 * @author Sunil Verma
 */
public class ChildMultipleConstructors extends MultipleConstructors {

	public ChildMultipleConstructors() {
		// Default Cons.
		System.out.println("From Default ChildMultipleConstructors Cons.");
	}

	public ChildMultipleConstructors(int a) {
		// Define Cons/ with 1 int
		// Check O/P without super also.
		super(a);
		System.out.println("From 1 int ChildMultipleConstructors Cons.");
		
	}

	public ChildMultipleConstructors(String str) {
		// Define Cons/ with 1 int
		// Check O/P without super also.
		super(str);
		System.out.println("From String ChildMultipleConstructors Cons.");
	}

	public ChildMultipleConstructors(int a, int b) {
		// Define Cons/ with 1 int
		// Check O/P without super also.
		super(a, b);
		System.out.println("From 2 int ChildMultipleConstructors Cons.");
	}
}
