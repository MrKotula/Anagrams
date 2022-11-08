package ua.com.foxminded.anagrams;

public class Anagrams {

	public static String stringReverse(String input) {

		StringBuilder result = new StringBuilder();
		for (String word : input.split(" ", 10)) {

			StringBuilder reverse = new StringBuilder(word.replaceAll("[^a-zA-Z_�-��-߸���]", "")).reverse();
			for (int i = 0; i < word.length(); i++) {

				if (!Character.isLetter(word.charAt(i))) {
					reverse.insert(i, word.charAt(i));
				}
			}
			result.append(reverse).append(" ");
		}
		return result.substring(0, result.length() - 1).toString();
	}
}
