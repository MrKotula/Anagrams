package ua.com.foxminded.anagrams;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		
		String result;
		Scanner scan = new Scanner(System.in);
		logger.info("Input some text: ");
		String someText = scan.nextLine();
		result = Anagrams.stringReverse(someText);
		logger.info(result);
		scan.close();
	}
}
