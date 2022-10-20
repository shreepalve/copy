package TestNGDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Day8_Utility.SeleniumUtility;

public class Testing3 extends SeleniumUtility {
  @Test
  public void LoginLogoutActitime() {
	  WebDriver driver=setUp("chrome","https://demo.actitime.com/login.do");
	  System.out.println("Before login page title: "+driver.getTitle());
	// identify the required element from the UI and perform required action 0-30
		//driver.findElement(By.id("username")).sendKeys("admin");
	  //or
	  WebElement UsernameField=driver.findElement(By.id("username"));
	//validate username field is displayed or not
	//  Assert.assertTrue(UsernameField.isDisplayed());
	  Assert.assertTrue(UsernameField.isDisplayed(), "Either usernamefield is not displayed or locator is change");
	    typeInput(UsernameField ,"admin");
	 // identify the required element from the UI and perform required action 0-30
	 		//driver.findElement(By.name("pwd")).sendKeys("manager");
	    //Or
	    typeInput(driver.findElement(By.name("pwd")),"manager");
	    
	 // identify the required element from the UI and perform reqiored action
	 		//driver.findElement(By.id("loginButton")).click(); // 0-30
	 				//or
	 		performClick(driver.findElement(By.id("loginButton")));
	 		
			 WebElement logoutBtn = driver.findElement(By.linkText("Logout"));
			// Explicit wait
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));

			System.out.println("After login page title: " + getPageTitle());
//			if(getPageTitle().equals("")) {
//				System.out.println("Passed");
//			}else {
//				System.out.println("Failed");
//			}
			//validation using TestNG
			Assert.assertEquals(getPageTitle(), "actiTIME - Enter Time-Track");
			performClick(logoutBtn);
			//login page validation
			Assert.assertEquals(getPageTitle(), "actiTIME - Login","Login page validation is failed");
			driver.close();
		}

	
  
}
/*
if testng class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/