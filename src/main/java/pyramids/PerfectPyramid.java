package pyramids;

/**
 * @author Sunil Verma
 */
public class PerfectPyramid {

	public PerfectPyramid(int depth) {
		// Creating a Pyramid as in Gaza!
		for (int i=1; i<depth; i++){
			for (int j2 = 0; j2 < depth-i; j2++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
