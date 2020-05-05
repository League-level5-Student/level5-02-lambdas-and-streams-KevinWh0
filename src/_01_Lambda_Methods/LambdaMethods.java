package _01_Lambda_Methods;

import java.util.ArrayList;
import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		Random rand = new Random();

		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			StringBuilder strB = new StringBuilder(s);
			System.out.println(strB.reverse());

		}, "repeat");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String str = "";
			for (int i = 0; i < s.length(); i++) {
				if (rand.nextBoolean()) {
					str = str + Character.toUpperCase(s.charAt(i));
				} else {
					str = str + Character.toLowerCase(s.charAt(i));
				}
			}
			System.out.println(str);

		}, "repeat");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String str = "";
			for (int i = 0; i < s.length(); i++) {
				str = str + s.charAt(i) + ".";

			}
			System.out.println(str);

		}, "repeat");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			ArrayList<Character> vowels = new ArrayList<Character>();
			vowels.add('a');
			vowels.add('e');
			vowels.add('i');
			vowels.add('o');
			vowels.add('u');
			vowels.add('y');

			
			String str = "";
			for (int i = 0; i < s.length(); i++) {
				if (!vowels.contains(Character.toLowerCase(s.charAt(i)))) {
					str = str + s.charAt(i);
				}
			}
			System.out.println(str);

		}, "repeat");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
