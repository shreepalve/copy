package day1;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Openfirefox {
public static void main(String[]args) {
	System.setProperty("webdriver.gecko.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\geckodriver.exe");
	FirefoxDriver fdriver=new FirefoxDriver();
	//enter application url
	fdriver.get("https://www.facebook.com/");
	//verify url and title
	String actualurl=fdriver.getCurrentUrl();
	String actualTitle=fdriver.getTitle();
	
	String expectedURl="https://www.facebook.com/";
	String expectedtitle="Facebook";
	System.out.println("Url validation "+actualurl.equals(expectedURl));
	System.out.println("Title validation "+actualTitle.equals(expectedtitle));
	String pageSource=fdriver.getPageSource();	
	System.out.println("page source length "+pageSource.length());
	System.out.println("page source containt:-  "+pageSource);
	fdriver.close();
}
}
