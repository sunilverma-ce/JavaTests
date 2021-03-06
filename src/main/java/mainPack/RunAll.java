package mainPack;

import arrays.TwoMaxNumbers;
import oopsConcepts.ChildConstructor;
import oopsConcepts.ChildMultipleConstructors;
import oopsConcepts.IntToString;
import oopsConcepts.MultipleConstructors;
import others.Factorial;
import others.PrimeNums;
import others.UniqueRandomNums;
import pyramids.LeftPyramid;
import pyramids.PascalsTriangle;
import pyramids.PerfectPyramid;
import pyramids.RightPyramid;
import stringRelated.ReplaceVowels;
import stringRelated.ReverseStringWords;
import stringRelated.UniqueChars;

/**
 * @author Sunil Verma
 */
public class RunAll {

	public static void main(String[] args) {
		UniqueChars my = new UniqueChars();
		ReverseStringWords reverse = new ReverseStringWords();
		LeftPyramid myLP = new LeftPyramid(15);
		RightPyramid myRP = new RightPyramid(15);
		PerfectPyramid myPP = new PerfectPyramid(15);
		ChildConstructor object1 = new ChildConstructor();
		MultipleConstructors default1 = new MultipleConstructors();
		MultipleConstructors int1 = new MultipleConstructors(1);
		MultipleConstructors str1 = new MultipleConstructors("test");
		MultipleConstructors int2 = new MultipleConstructors(1, 0);

		ChildMultipleConstructors defaultChild = new ChildMultipleConstructors();
		ChildMultipleConstructors int1Child = new ChildMultipleConstructors(1);
		ChildMultipleConstructors strChild = new ChildMultipleConstructors("");
		ChildMultipleConstructors int2Child = new ChildMultipleConstructors(2, 3);

		PrimeNums myNum = new PrimeNums(107);
		PrimeNums allPrime = new PrimeNums(1, 200);
		Factorial myFact = new Factorial(5);
		IntToString convert = new IntToString();
		PascalsTriangle creatingTriangle = new PascalsTriangle(10);
		ReplaceVowels testVowels = new ReplaceVowels("This abstract will show replacement.");
		System.out.println("My Random num is: " + UniqueRandomNums.generateUniqueNum());
		int[] myArray = {123, 32, 4, 67, 65, 98, 99, 45, 33, 55, 99};
		TwoMaxNumbers letsFindOut = new TwoMaxNumbers(myArray);

	}
}
