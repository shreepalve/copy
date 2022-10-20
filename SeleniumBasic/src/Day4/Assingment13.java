package Day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment13 {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.gsmarena.com/");
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.manage().window().maximize();
	List<WebElement> list=d.findElements(By.cssSelector("body>div>div>div>aside>div>ul>li>a"));
	System.out.println("size of list is: "+list.size());
	int count=1;
	for(int i=0;i<list.size();i++) {
		System.out.println(count+" "+list.get(i).getText());
		count++;
	}
}
}
