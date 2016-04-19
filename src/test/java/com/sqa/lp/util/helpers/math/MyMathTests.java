/**
 *   File Name: MyMathTests.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.lp.util.helpers.math;

import static org.testng.Assert.*;

import org.testng.annotations.*;

import com.sqa.lp.util.helpers.*;

/**
 * MyMathTests //ADDD (description of class)
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

public class MyMathTests {

	@DataProvider
	public static Object[][] getData() {
		Object[][] data = { { 2.0, 2.0, 4.0 }, { 5.0, 2.0, 25.0 }, { 4.0, 3.0, 64.0 }, { 1.0, 0.0, 1.0 },
				{ 3.0, 1.0, 3.0 }, { 2.0, 1.5, 4 } };
		return data;
	}

	@Test(enabled = false)
	public void testDivideNumbers() {
		double actualResult;
		double expectedResult = 3.0;
		double numerator = 12.0;
		double denominator = 4.0;

		actualResult = MyMath.divideNumbers(numerator, denominator);
		String message = String.format("The result of %.0f divided by %.0f is %.0f ", numerator, denominator,
				actualResult);

		System.out.println(message);
		assertEquals(expectedResult, actualResult, 0, message);
	}

	@Test(enabled = false)
	public void testMyMathClass() {
		double result;
		double addNumber = 10;
		double subNumber = 3;
		double mulNumber = 2;
		double divNumber = 7;

		MyMath myMath = new MyMath();
		// MyMath myMath = new MyMath(3);

		myMath.add(addNumber);
		myMath.sub(subNumber);
		myMath.mult(mulNumber);
		myMath.div(divNumber);

		result = myMath.getTotal();

		System.out.println(String.format("The result is %.0f", result));
		myMath.displayOperations(5);
	}

	@Test(dataProvider = "getData")
	public void testPowerNumbers(double num, double power, double expectedResult) {
		double actualResult = MyMath.powerNumber(num, power);

		String message = String.format("The result of %.0f to the power of %.0f is %.0f ", num, power, actualResult);

		System.out.println(message);
		assertEquals(expectedResult, actualResult, 0, message);
	}

}
