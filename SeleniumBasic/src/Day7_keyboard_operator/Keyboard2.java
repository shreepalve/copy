package Day7_keyboard_operator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard2 {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement web=d.findElement(By.name("username"));
		web.sendKeys("admin");
		web.sendKeys(Keys.chord(Keys.CONTROL,"c"));
}
}