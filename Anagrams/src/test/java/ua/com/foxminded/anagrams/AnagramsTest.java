package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnagramsTest {

	@Test
	void checkNullTest() {
		assertNotNull(Anagrams.stringReverse(""));
	}

	@Test
	void checkEmptyStringTest() {
		assertEquals("", Anagrams.stringReverse(""));
	}

	@Test
	void checkSingleSpaceTest() {
		assertEquals(" ", Anagrams.stringReverse(" "));
	}

	@Test
	void checkSeveralSpacesTest() {
		assertEquals("  ", Anagrams.stringReverse("  "));
	}

	@Test
	void checkSingleCharacterTest() {
		assertEquals("A", Anagrams.stringReverse("A"));
	}

	@Test
	void checkMultipleSameLetterTest() {
		assertEquals("aaa", Anagrams.stringReverse("aaa"));
	}

	@Test
	void checkLettersInCasesTest() {
		assertEquals("bBaAaA", Anagrams.stringReverse("AaAaBb"));
	}

	@Test
	void checkWordTest() {
		assertEquals("olleH", Anagrams.stringReverse("Hello"));
	}

	@Test
	void checkOnlySymbolTest() {
		assertEquals("@!$", Anagrams.stringReverse("@!$"));
	}

	@Test
	void checkSeveralWordsTest() {
		assertEquals("olleH ym dneirf", Anagrams.stringReverse("Hello my friend"));
	}

}
