package Day7_keyboard_operator;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	

	

	public class copypaste {

		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver",
						"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		 WebDriver d =  new ChromeDriver();
		 d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 d.get("https://www.facebook.com/reg/");
		 WebElement name= d.findElement(By.name("firstname"));
				 name.sendKeys("pallavi",Keys.chord(Keys.CONTROL,"a"));
				 name.sendKeys(Keys.chord(Keys.CONTROL,"c"));
				WebElement lastname= d.findElement(By.name("lastname"));
						lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
						Thread.sleep(1000);
						
					WebElement email=	d.findElement(By.name("firstname"));
					email.sendKeys(Keys.chord(Keys.CONTROL,"a"));
					
						email.sendKeys(Keys.chord(Keys.CONTROL,"x"));
						Thread.sleep(1000);
						
						d.findElement(By.name("reg_email__")).sendKeys((Keys.chord(Keys.CONTROL,"v")));
					Actions act=new Actions(d);
					Thread.sleep(1000);
					
						act.doubleClick(lastname).perform();
						lastname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
						d.findElement(By.name("firstname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
						
				 
	}	 

}
