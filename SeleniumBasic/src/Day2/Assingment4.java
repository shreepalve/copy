package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assingment4 {
public static void main(String[]args) {
System.setProperty("webdriver.gecko.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demosite.executeautomation.com/Login.html");
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(By.name("UserName")));
	WebElement username=driver.findElement(By.name("UserName"));
	username.sendKeys("execution");
	WebElement password=driver.findElement(By.name("Password"));
	password.sendKeys("admin");
	driver.findElement(By.name("Login")).click();
	System.out.println("Title is : "+driver.getTitle());
	WebDriverWait wat=new WebDriverWait(driver,20);
	//wat.until(ExpectedConditions.elementToBeClickable));
}
}
