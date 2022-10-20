package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
public static void main(String[]args) {
	//set property 
	System.setProperty("webdriver.chrome.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	//create instance of chrome driver
	ChromeDriver cdriver=new ChromeDriver();
	 //enter application url
	cdriver.get("https://www.google.com");
	//verify url and title 
	String actualUrl=cdriver.getCurrentUrl();
	String actualTitle=cdriver.getTitle();
	String expectedUrl="https://www.google.com/";
	String expectedTitle="Rahul";
	System.out.println("validation of url "+actualUrl.equals(expectedUrl));
	System.out.println("validation of Title "+actualTitle.equals(expectedTitle));
	String ch=cdriver.getTitle();
	System.out.println(ch);
	cdriver.close();
  //System.out.println();					
}
}
