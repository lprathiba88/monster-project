/**
 *   File Name: AppBasicsTests.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */

package com.sqa.lp.util.helpers;

import org.testng.annotations.*;

/**
 * AppBasicsTests //ADDD (description of class)
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
public class AppBasicsTests {

	static String appName = "Sample";

	static String userName;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeMethod
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterMethod
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.sqa.lp.util.helpers.AppBasics#farewellUser(java.lang.String, java.lang.String)}
	 * .
	 */

	@Test
	public void testFarewellUser() {
		AppBasics.farewellUser(userName, appName);
	}

	/**
	 * Test method for
	 * {@link com.sqa.lp.util.helpers.AppBasics#welcomeUserAndGetUserName(java.lang.String)}
	 * .
	 */
	@Test
	public void testWelcomeUser() {
		userName = AppBasics.welcomeUserAndGetUserName(appName);
	}

}
