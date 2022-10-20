package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Asssingment1 {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.in/l/29657746031/?pf_rd_r=T5CTR8MP00BDWEE1V6BN&pf_rd_p=2bf5bfaa-b1de-40b6-91cc-f46bb89eab9e&pd_rd_r=f2debb52-86c0-4c4c-990c-fe32daa79839&pd_rd_w=2A1yQ&pd_rd_wg=KrppL&ref_=pd_gw_unks");
driver.manage().window().maximize();
String actualtitle=driver.getTitle();
System.out.println("title is : "+actualtitle);
//bDriverWait wait=new WebDriverWait(driver,30);
//wait.until(ExpectedConditions.elementToBeClickable(By.className("hm-icon-label")));
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.cssSelector()).click();
//driver.findElement(By.cssSelector(".hmenu-item")).click();
//driver.findElement(By.cssSelector("#nav_cs_3"));
}
}
 