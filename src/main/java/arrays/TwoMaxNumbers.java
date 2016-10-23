package arrays;

public class TwoMaxNumbers {
	public TwoMaxNumbers(int[] inputArray) {
		int highest = 0;
		int secondHighest = 0;
		
		for (int eachElement:inputArray){
			if (highest < eachElement){
				secondHighest = highest;
				highest = eachElement;
			}
			else if (secondHighest < eachElement)
				secondHighest = eachElement;
		}
		System.out.println("Highest Number is: " + highest);
		System.out.println("Second Highest Number is: " + secondHighest);
	}
}
