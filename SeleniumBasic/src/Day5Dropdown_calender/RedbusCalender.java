package Day5Dropdown_calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("src")).sendKeys("pune");
	driver.findElement(By.cssSelector("ul.autoFill.homeSearch>:nth-child(2)>i"));
	driver.findElement(By.id("dest")).sendKeys("Goa");
    driver.findElement(By.cssSelector("ul.autoFill.homeSearch>:nth-child(2)")).click();
	driver.findElement(By.className("next")).click();
	driver.findElement(By.cssSelector("tbody>:nth-child(4)>:nth-child(7)")).click();
	driver.findElement(By.id("search_btn")).click();//search
	driver.findElement(By.cssSelector("div.filter-details.f-12.d-color>div.details>ul.dept-time.dt-time-filter>li.checkbox>label")).click();
	driver.findElement(By.cssSelector("li.checkbox>label[for=bt_AC]")).click();
	WebElement list = driver.findElement(By.cssSelector("li.row-sec.clearfix>div>div>div>div>div.travels.lh-24.f-bold.d-color"));
	
List<WebElement> travels= driver.findElements(By.cssSelector("div.travels.lh-24.f-bold.d-color"));
	System.out.println("size: "+travels.size());
	List<WebElement> price = driver.findElements(By.cssSelector("span.f-19.f-bold"));
	for(int i=0;i<travels.size();i++) {
      System.out.println(travels.get(i).getText()+" = "+price.get(i).getText());
		}
    

	}

}
