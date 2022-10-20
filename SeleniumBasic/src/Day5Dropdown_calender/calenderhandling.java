package Day5Dropdown_calender;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderhandling {
	public static void main(String[] args) {
	//System.getProperty("webdriver.chrome.driver") + 
				//"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe";
		// step1: set driver executable path by using System.setProperty(String
		// key,String value)
		System.setProperty("webdriver.chrome.driver", 
				"D:\\\\Workspace\\\\SeleniumBasic\\\\Executable\\\\chromedriver.exe");
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		try {
			// close login popup
			driver.findElement(By.cssSelector("li[data-cy='outsideModal']")).click();
		} catch (NoSuchElementException e) {
		}
		// identify departure date and click on it
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		// select any date from next month
		driver.findElement(By.cssSelector(
				"div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();

	}
}
