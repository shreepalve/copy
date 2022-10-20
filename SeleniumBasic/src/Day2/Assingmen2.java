package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingmen2 {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement username=driver.findElement(ByCssSelector());
	//username.clear();
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.name("password"));
	//spassword.clear();
	password.sendKeys("admin123");
	driver.findElement(By.name("login")).click();
}
}
/*
 Open chrome browser
Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Validate login page
Enter user name as Admin
Password as admin123
Click on login button
Validate home page
  
 */