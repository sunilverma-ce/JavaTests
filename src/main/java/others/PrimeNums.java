package others;

/**
 * @author Sunil Verma
 */
public class PrimeNums {
	/**
	 * Check if number is Prime or not
	 * @param checkNumber
	 */
	public PrimeNums(int checkNumber) {
		Boolean isPrime = false;
		for (int i = 2; i < (checkNumber / 2); i++) {
			if (checkNumber % i == 0) {
				System.out.println("The input number is Not prime");
				isPrime = true;
				break;
			}
		}
		if (isPrime == false )
			System.out.println("The input number is prime");
	}

	/**
	 * Constructor to print prime numbers b/w m to n.
	 * @param fromM,toN
	 */
	public PrimeNums(int fromM, int toN) {
		String primeNumbers = "";
		if (fromM < toN && fromM >= 0) {
			for (int i = fromM; i < toN; i++) {
				int dividedTimes = 0;
				for (int num = (i/2); num >= 1; num--) {
					if (i%num == 0)
						dividedTimes += 1;
				}
				if ( dividedTimes == 1)
					primeNumbers += i + " ";
			}
			System.out.println("Prime Numbers from " + fromM + " to " + toN + " are: " + primeNumbers);
		}
		else
			System.out.println("Please provide a valid range.");
	}
}
