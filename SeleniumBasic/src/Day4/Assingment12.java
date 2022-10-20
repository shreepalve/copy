package Day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assingment12 {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
    		"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
    WebDriver d=new ChromeDriver();
    d.get("https://www.espncricinfo.com/");
d.manage().window().maximize();
//WebDriverWait wait=new WebDriverWait(d,10);
//wait.until(ExpectedConditions.elementToBeClickable(By))
d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
List<WebElement> list =d.findElements(By.cssSelector("div>div>a.ci-nav-hover.ds-cursor-pointer"));
System.out.println("size of list: "+list.size());
int count=1;
for(int i=0; i<list.size();i++) {
	System.out.println(count+" "+list.get(i).getText());
	count++;
}
}

}
//open crisinfo.com
//Validate home page 
//get count of main menu options 
//print main menu option name