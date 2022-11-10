package ua.com.foxminded.anagrams;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Input some text: ");
		String someText = scan.nextLine();
		System.out.println(Anagrams.stringReverse(someText));
		scan.close();

	}

}
