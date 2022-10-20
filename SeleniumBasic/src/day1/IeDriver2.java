package day1;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class IeDriver2 {
public static void main(String[]args) {
	System.setProperty("webdriver.ie.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\IEDriverServer.exe");
	InternetExplorerDriver Iek=new InternetExplorerDriver();
	Iek.get("https://www.amazon.in");
	String actualUrl=Iek.getCurrentUrl();
	String actualTitle=Iek.getTitle();
	String ExpectedUrl="https://www.amazon.in";
	String ExpectedTitle="Amazone";
	System.out.println("validate Url "+actualUrl.equals(ExpectedUrl));
	System.out.println("validate Title "+actualTitle.equals(ExpectedTitle));
	String Pagesource=Iek.getPageSource();
	System.out.println("pagesource length"+Pagesource.length());
	System.out.println("Pagesource contain "+Pagesource);
	Iek.close();
}
}
