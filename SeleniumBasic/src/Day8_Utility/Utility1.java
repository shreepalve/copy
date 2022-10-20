package Day8_Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utility1 {
	static WebDriver driver=null;

	public static void main(String[] args) {
		setUp("chrome", "http:/www.google.com");
		System.out.println(driver.getTitle());

		cleanUp();

	}
	static void setUp(String browserName, String url) {
		String exePath;
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")){

			exePath= System.getProperty("webdriver.chrome.driver"+
					"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",
					"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe" );
			driver= new ChromeDriver();

		}else if (browserName.equalsIgnoreCase("firefox")) {
			exePath=System.getProperty("webdriver.gecko.driver"+
					"D:\\Workspace\\SeleniumBasic\\Executable\\geckodriver.exe");
			System.getProperty("webdriver.gecko.driver"+
					"D:\\Workspace\\SeleniumBasic\\Executable\\geckodriver.exe");
			driver=new FirefoxDriver();

		}else if (browserName.equalsIgnoreCase("ie")) {
			exePath=System.getProperty("user.dir", 
					"D:\\Workspace\\SeleniumBasic\\Executable\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver",
					"D:\\Workspace\\SeleniumBasic\\Executable\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	static void cleanUp() {
		driver.close();
	}
}
