package pyramids;

/**
 * @author Sunil Verma
 */
public class RightPyramid {
	public RightPyramid(int depth) {
		// Right indented pyramid with an extra for loop
		for (int i=1; i<depth; i++){
			for (int j2 = depth-i; j2 > 1; j2--) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++){

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
