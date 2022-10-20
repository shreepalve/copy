package day1;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;
 
public class OpenIeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver",
				"D:\\Workspace\\SeleniumBasic\\Executable\\IEDriverServer.exe");
		WebDriver Ied=new InternetExplorerDriver();
		 
		Ied.get("https://www.flipkart.com");
		String actualUrl=Ied.getCurrentUrl();
		String actualTitle=Ied.getTitle();
		
		String expectedUrl="https://www.flipkart.com";
		String expectedTitle="Flipcart";
		System.out.println("validation of Url "+actualUrl.equals(expectedUrl));
		System.out.println("validation of title "+actualUrl.equals(expectedTitle));
        System.out.println(Ied.getTitle());
	}

}
