package Day4;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
  public class Assingment16 {
public static void main(String[]args) {
	System.setProperty("webdriver.gecko.driver", 
			"D:\\Workspace\\SeleniumBasic\\Executable\\geckodriver.exe");
	WebDriver d=new FirefoxDriver();
	d.get("https://www.gsmarena.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	d.findElement(By.cssSelector("body>div>div>div>aside>div>ul>li>a")).click();
	List<WebElement> list=d.findElements(By.cssSelector("ul>li>a>strong>span"));
	System.out.println("Size of list "+list.size());
	int count=1;
	for(int i=0; i<list.size();i++) {
	System.out.println(count+" "+list.get(i).getText());
	count++;
	}
}
}
