package Day7_keyboard_operator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Keyboardops1 {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://demo.actitime.com/login.do");
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	d.findElement(By.name("username")).sendKeys("admin");
	WebElement web= d.findElement(By.name("pwd"));
	web.sendKeys("manager",Keys.ENTER);
	
	
}
}
