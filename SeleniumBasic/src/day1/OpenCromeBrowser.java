package day1;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenCromeBrowser {
public static void main(String[]args) {
	//step 1- using System.setProperty(key.value) set to path for CromeDriver.exe
	System.setProperty("webdriver.chrome.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
   //step2- create an instanceof Crome drover class
	ChromeDriver cdriver=new ChromeDriver();
	
}}