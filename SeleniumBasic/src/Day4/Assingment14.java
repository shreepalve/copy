package Day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment14 {
	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver",
	    		"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	    WebDriver d=new ChromeDriver();
	    d.get("https://www.demoblaze.com/");
	d.manage().window().maximize();
	//WebDriverWait wait=new WebDriverWait(d,10);
	//wait.until(ExpectedConditions.elementToBeClickable(By))
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.findElement(By.cssSelector("body>*:nth-child(6)>div>div>div>*:nth-child(2)")).click();
	List<WebElement> list =d.findElements(By.cssSelector("div>h4>a.hrefch"));
	System.out.println("size of list: "+list.size());
	int count=1;
	for(int i=0; i<list.size();i++) {
		System.out.println(count+" "+list.get(i).getText());
		count++;
	}
	}
}
