package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aptitime2 {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\\\Workspace\\\\SeleniumBasic\\\\Executable\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username= driver.findElement(By.name("email"));
		username.sendKeys("shreepalve777@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Shree@777");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.height("100%"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("alzwoclg ")));
		
		
	}
	

}
