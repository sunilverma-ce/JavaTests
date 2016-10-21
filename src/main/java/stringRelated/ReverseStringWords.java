package stringRelated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Sunil Verma
 */
public class ReverseStringWords {
	public ReverseStringWords() {
		BufferedReader myBR = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String to reverse:");
		try {
			String newStr = myBR.readLine();
			String[] myArray = newStr.split(" ");
			for (int i = 0; i < myArray.length; i++) {
				myArray[i] = reverseWord(myArray[i]);
				System.out.print(myArray[i] + " ");
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	static String reverseWord(String orgStr){
		char[] wordBybChar = orgStr.toCharArray();
		String reversedWord = "";
		for (int i = wordBybChar.length - 1; i >= 0; i--) {
			reversedWord += wordBybChar[i];
		}
		return reversedWord;
	}
}
