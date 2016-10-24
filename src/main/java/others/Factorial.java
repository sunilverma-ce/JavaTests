package others;

/**
 * @author Sunil Verma
 */
public class Factorial {
	private double result = 1;

	// Creating one constructor to do this.
	public Factorial(int a) {
		System.out.println("The factorial of int " + a + " is : " + calcFactorial(a));
	}

	// Call this function recursively anc calc Factorial
	private double calcFactorial(int subVar) {
		if (subVar > 1)
			result = subVar * calcFactorial(subVar - 1);
		return result;
	}

}
