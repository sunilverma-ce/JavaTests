package others;

import java.util.Random;

/**
 * @author Sunil Verma
 */
public class UniqueRandomNums {

	public static int generateUniqueNum() {
		Random myRandomGen = new Random();
		return myRandomGen.nextInt(1000);
	}
}
