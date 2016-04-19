package com.sqa.lp.monster;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MonsterTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.monster.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMonsterTests() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("li.active > #loginLink > span.navbar-profile-icon.center-block")).click();
    driver.findElement(By.id("EmailAddress")).clear();
    driver.findElement(By.id("EmailAddress")).sendKeys("prat33@gmail.com");
    driver.findElement(By.id("Password")).clear();
    driver.findElement(By.id("Password")).sendKeys("sqa140sanpedro");
    driver.findElement(By.xpath("(//input[@value='Sign In'])[2]")).click();
    driver.findElement(By.id("ctl00__powerSearchControl__ptbKeywords")).clear();
    driver.findElement(By.id("ctl00__powerSearchControl__ptbKeywords")).sendKeys("java selenium");
    driver.findElement(By.id("ctl00__powerSearchControl__btnSearch")).click();
    driver.findElement(By.cssSelector("a[title=\"Sign Out\"]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
