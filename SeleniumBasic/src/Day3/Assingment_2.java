package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment_2 {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("");
}
}
