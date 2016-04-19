/**
 *   File Name: RequestInput.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */

package com.sqa.lp.util.helpers;

import java.util.*;

import com.sqa.lp.helpers.exceptions.*;

import com.sqa.lp.helpers.exceptions.InvalidAcceptableDoubleException;
import com.sqa.lp.helpers.exceptions.InvalidAcceptableNumberException;
import com.sqa.lp.helpers.exceptions.InvalidAcceptableWordsException;

/**
 * RequestInput //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestInput {
	private static Scanner scanner;

	// Get a char value from the user
	// DONE
	public static char getChar(String question) {

		char character;
		String input;

		System.out.println(question);

		scanner = new Scanner(System.in);
		input = (scanner.nextLine());

		return 0;
	}

	// Get a char value from the user, must be an acceptable value
	// DONE
	public static char getChar(String question, char... c) {
		return 0;

	}

	// Get a double value from the user
	// DONE
	public static double getDouble(String question, double... acceptableNumber) {
		System.out.println("Inside get double method");
		boolean validDouble = false;
		double resultValue = 0;

		while (true) {
			try {
				System.out.println(question);
				scanner = new Scanner(System.in);
				resultValue = Double.parseDouble(scanner.nextLine());

				for (int i = 0; i < acceptableNumber.length; i++) {
					if (resultValue == acceptableNumber[i]) {
						validDouble = true;
						break;
					}
				}
				if (!validDouble) {
					throw new InvalidAcceptableDoubleException();
				}
				return resultValue;
			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid double type (" + resultValue + ")");
			} catch (InvalidAcceptableDoubleException e) {
				System.out.println("You have not provided a value within the acceptable range (" + resultValue + ")");
			}
		}

	}

	// Get a int from the user, must be in acceptable range value
	// DONE
	public static int getInt(String question, int... acceptableNumber) {
		int resultValue;
		boolean validInt = false;
		String input = null;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = Integer.parseInt(input);
				for (int i = 0; i < acceptableNumber.length; i++) {
					if (resultValue == acceptableNumber[i]) {
						validInt = true;
					}
				}
				if (!validInt) {
					throw new InvalidAcceptableNumberException();
				}

				return resultValue;
			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid integer type (" + input + ")");
			} catch (InvalidAcceptableNumberException e) {
				System.out.println("You have not provided a value within the acceptable range (" + input + ")");
			}
		}
	}

	public static int getIntWithRange(String question, int intMin, int intMax) {

		scanner = new Scanner(System.in);

		int input = 0;
		while (true) {
			try {
				System.out.println(question);
				input = Integer.parseInt(scanner.nextLine());

				if (input >= intMin && input <= intMax) {
					return input;
				} else {
					throw new InvalidAcceptableNumberException();
				}
			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid integer type (" + input + ")");
			} catch (InvalidAcceptableNumberException e) {
				System.out.println("You have not provided a value within the acceptable range (" + input + ")");
			}
		}

	}

	public static String getString(String question) {
		// Local variable to hold temporary number
		String input;
		scanner = new Scanner(System.in);
		// Ask the user a question to get relative input
		System.out.print(question);
		// Set the number based on what the user enters on their
		// keyboard
		input = scanner.nextLine();
		// Return input user has entered
		return input;
	}

	// Get a String from the user, must be an acceptable value
	// DONE
	public static String getString(String question, String... acceptableWords) {

		String resultValue = null;
		boolean validWord = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				resultValue = scanner.nextLine();
				for (int i = 0; i < acceptableWords.length; i++) {
					if (resultValue.equalsIgnoreCase(acceptableWords[i])) {
						validWord = true;
					}
				}
				if (!validWord) {
					throw new InvalidAcceptableWordsException();
				}

				return resultValue;
			} catch (InvalidAcceptableWordsException e) {
				System.out.println("You have not provided a value within the acceptable range (" + resultValue + ")");
			}
		}
	}

	public static int getStringWithoutWords(String question, String... InvalidWords) {
		return 0;
	}

	// Create your own helper method that you may find useful

}
