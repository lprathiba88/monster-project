/**
 *   File Name: RequestInputTest.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */

package com.sqa.lp.util.helpers;

import java.util.*;

import org.testng.annotations.*;

/**
 * RequestInputTest //ADDD (description of class)
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
public class RequestInputTest {

	static private String question;
	static private Scanner scanner;
	static private String userName;
	static private Object userValue;

	/**
	 *
	 */
	@AfterClass
	public static void farewellUser() {
		// TODO Auto-generated method stub
		System.out.println("Thank you " + userName + " for executing my Request Input tests.\n Bye!");
		scanner.close();
	}

	/**
	 *
	 */
	@BeforeClass
	public static void welcomeUser() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my Request Input Tests");
		System.out.print("Could you please provide me your name:");
		scanner = new Scanner(System.in);
		userName = scanner.nextLine();

	}

	/**
	 * @param question
	 * @param userValue
	 */
	@BeforeMethod
	public void clearVariables() {
		question = "";
		userValue = "";
	}

	/**
	 * @param question
	 * @param userValue
	 */
	@AfterMethod
	public void displayOutput() {
		// TODO Auto-generated method stub
		System.out.println("For the question \"" + question + "\", you have given the value of (" + userValue + ")");

	}

	/**
	 * Test method for
	 * {@link com.sqa.lp.util.helpers.RequestInput#getChar(java.lang.String)}.
	 */
	@Test(enabled = false)
	public void testGetChar() {

	}

	/**
	 * Test method for
	 * {@link com.sqa.lp.util.helpers.RequestInput#getChar(java.lang.String, char[])}
	 * .
	 */
	@Test(enabled = false)
	public void testGetCharStringCharArray() {

	}

	/**
	 * Test method for
	 * {@link com.sqa.lp.util.helpers.RequestInput#getDouble(java.lang.String)}.
	 */
	@Test
	public void testGetDouble() {
		System.out.println("Inside test double");
		question = "Please give me your favourite double number:";
		userValue = RequestInput.getDouble(question, 1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8);
	}

	/**
	 * Test method for
	 * {@link com.sqa.lp.util.helpers.RequestInput#getIntString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	public void testGetInt() {
		question = "Please give me your lucky number:";
		userValue = RequestInput.getInt(question, 1, 2, 3, 4, 5, 6, 7);
	}

	/**
	 * Test method for
	 * {@link com.sqa.lp.util.helpers.RequestInput#getIntString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	public void testGetIntWithRange() {
		question = "Please give me your favourite number:";
		userValue = RequestInput.getInt(question, 1, 9);
	}

	/**
	 * Test method for
	 * {@link com.sqa.lp.util.helpers.RequestInput#getString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	public void testGetString() {
		question = "Please give me your favourite color:";
		userValue = RequestInput.getString(question, "red", "white", "blue");
	}

}
