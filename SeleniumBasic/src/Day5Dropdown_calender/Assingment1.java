package Day5Dropdown_calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://demo.automationtesting.in/Register.html");
   WebElement countryDropdown= driver.findElement(By.cssSelector("span.select2-selection__arrow"));
    countryDropdown.click();
    List<WebElement> options=driver.findElements(By.id("#basicBootstrapForm"));
  // System.out.println("is multiple dropdown "+country.isMultiple());
    //System.out.println("is any country select first "+country.getFirstSelectedOption());
   // List<WebElement> options=country.getOptions();
    System.out.println("size of option "+options.size());
    int count=1;
    for(int i=0;i<options.size();i++) {
    	System.out.println("option "+count+" "+options.get(i).getText());
    	count++;
    }
  /*  country.selectByIndex(3);
    System.out.println(country.getFirstSelectedOption().getText());
    country.selectByValue("India");
    System.out.println(country.getFirstSelectedOption().getText());
    country.selectByVisibleText("japan");
    System.out.println(country.getFirstSelectedOption());*/
	}

}
