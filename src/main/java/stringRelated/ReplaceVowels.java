package stringRelated;

public class ReplaceVowels {
	public ReplaceVowels(String input) {
		// Replace Vowels from input string of Constructor
		System.out.println("Replaced Vowels to make string: " + input.replaceAll("[aeiouAEIOU]", ""));
	}
}
