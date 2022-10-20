package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assingment15 {
public static void main(String[]args) {
	System.setProperty("webdriver.gecko.driver", 
			"D:\\Workspace\\SeleniumBasic\\Executable\\geckodriver.exe");
	WebDriver d=new FirefoxDriver();
	d.get("https://www.facebook.com/");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.findElement(By.id("u_0_0_4x")).click();
}
}
