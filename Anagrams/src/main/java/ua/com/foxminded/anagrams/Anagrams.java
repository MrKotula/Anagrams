package ua.com.foxminded.anagrams;

public class Anagrams {
	
	private Anagrams() {
		
	}
	
	public static final String WORD_DELIMITER = " ";
    public static final String WORD_CONNECTOR = "";

    public static String stringReverse(String input) {

	StringBuilder anagramBuilder = new StringBuilder();
	for (String word : input.split(WORD_DELIMITER, 10)) {

	    StringBuilder reversedNonLettersBuilder = new StringBuilder(
		    word.replaceAll("[^a-zA-Z_à-ÿÀ-ß¸¨³²]", WORD_CONNECTOR)).reverse();
	    for (int i = 0; i < word.length(); i++) {

		if (!Character.isLetter(word.charAt(i))) {
		    reversedNonLettersBuilder.insert(i, word.charAt(i));
		}
	    }
	    anagramBuilder.append(reversedNonLettersBuilder).append(WORD_DELIMITER);
	}
	return anagramBuilder.substring(0, anagramBuilder.length() - 1);
    }
}
