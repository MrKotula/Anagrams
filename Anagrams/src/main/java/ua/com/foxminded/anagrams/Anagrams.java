package ua.com.foxminded.anagrams;

public class Anagrams {
	
	public static String stringReverse(String s) {
		
		StringBuilder result = new StringBuilder();
		for (String word : s.split(" ")) {

			StringBuilder reverse = new StringBuilder(word.replaceAll("[\\W\\d+]", "")).reverse();

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

