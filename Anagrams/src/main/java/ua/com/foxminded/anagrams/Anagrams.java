package ua.com.foxminded.anagrams;

public class Anagrams {

	public static String stringReverse(String input) {

		StringBuilder result = new StringBuilder();
		for (String word : input.split(" ")) {

			StringBuilder reverse = new StringBuilder(word.replaceAll("[^a-zA-Z_0-9à-ÿÀ-ß¸¨³²]", "")).reverse();
			for (int i = 0; i < word.length(); i++) {

				if (!Character.isLetter(word.charAt(i))) {
					reverse.insert(i, word.charAt(i));
				}

			}
			result.append(reverse).append(" ");
		}
		return result.toString();
	}
}
