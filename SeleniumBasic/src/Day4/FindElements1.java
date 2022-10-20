package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("");
}
}
