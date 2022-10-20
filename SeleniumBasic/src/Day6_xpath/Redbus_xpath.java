package Day6_xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_xpath {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
	
	driver.findElement(By.xpath("//li[@data-id='66920']")).click();
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai");
	driver.findElement(By.xpath("//li[@data-id='66545']")).click();
	driver.findElement(By.xpath("//td[@class='next']")).click();
	driver.findElement(By.xpath("//td[text()='8']")).click();
	driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
	driver.findElement(By.xpath("//label[@for=\"dtBefore 6 am\"]")).click();
    Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@for='bt_SEATER' and @class='custom-checkbox']")).click();
	
	List<WebElement> list=driver.findElements(By.cssSelector(".column-two.p-right-10.w-30.fl"));
	for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i).getText());
		 Thread.sleep(1000);
	}
	}
}