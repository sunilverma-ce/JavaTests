package pyramids;

/**
 * @author Sunil Verma
 */
public class LeftPyramid {
	public LeftPyramid(int depth) {
		// Simplest form of pyramid, Left one
		for (int i=1; i<depth; i++){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
