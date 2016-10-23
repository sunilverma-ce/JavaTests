package pyramids;

/**
 * @author Sunil Verma
 */
public class PascalsTriangle {

	public PascalsTriangle(int depth) {
		// Creating a Pascal Triangle from here
		for(int i = 0; i < depth; i++) {
			int number = 1;
			System.out.format("%" + (depth - i) * 2 + "s","");
			for(int j = 0; j <= i; j++) {
				// First row taken care for i=0 and j=0
				System.out.format("%4d", number);
				// Multiple numbers in the row
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
