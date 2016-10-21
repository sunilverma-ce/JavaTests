package stringRelated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Sunil Verma
 */
public class UniqueChars {

	public UniqueChars() {
		BufferedReader myBR = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String to find unique char s:");
		try {
			String newStr = myBR.readLine();
			String uniqueStr = "";
			for (int i = 0; i < newStr.length(); i++) {
				if(!(uniqueStr.contains(String.valueOf(newStr.charAt(i)))) ){
					uniqueStr += newStr.charAt(i);
				}
			}
			System.out.println(uniqueStr);
		} catch (IOException e) {
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
