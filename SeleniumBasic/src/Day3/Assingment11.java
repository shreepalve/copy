package Day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment11 {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://www.flipkart.com/");
	d.findElement(By.className("_2doB4z")).click();
	List<WebElement> list =d.findElements(By.cssSelector("div>div>a>*:nth-child(2).xtXmba"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
}
}}
