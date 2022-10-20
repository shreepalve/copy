package Day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Attimelogin {
public static void main (String[]args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://demo.actitime.com/");
  //enter user name as admin
  /* lucate user name field from ui
   */
   WebElement Username=driver.findElement(By.id("username"));
   /**
	 * after identifying the WebElement we can perform following operation in it
	 * type input----> sendKeys("") click ----> click() delete existing ---->
	 * clear()
	 */
   Username.sendKeys("admin");
//identify password field
   WebElement password=driver.findElement(By.name("pwd"));
	/**type password as manager*/
	password.sendKeys("manager");
   //click on login button
   driver.findElement(By.id("loginButton")).click();
   //validate home page
   String exceptedTitle= "actiTime";
   String actualTitle="actiTime";
   
   System.out.println("validation of title "+actualTitle.equals(exceptedTitle));

}

}
