package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assingment1 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	WebElement username=driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys("admin");
	WebElement password=driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("Test@123");
	driver.findElement(By.className("button")).click();
	driver.findElement(By.className("fa-user")).click();
	driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
	
}

}
/*open a chrome browser
enter vtiger application url- https://demo.vtiger.com/vtigercrm/index.php
validation login page open or not
remove existing text from username field
type username as 'admin'
remove existing text from password field
type password as 'Test@123'
click on login button


*/