package Day8_Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//all source frame and target place where drop image inspect
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		Actions act= new Actions(driver);
		//first element which drag  inspect
	    List <WebElement> sourseElement=driver.findElements(By.cssSelector("ul#gallery> li"));
	    //target- where to drop element 
	    WebElement target=driver.findElement(By.id("trash"));
	   // act.dragAndDrop(sourseElement.get(0), target).build().perform();
	    //Thread.sleep(1000);
	    //act.dragAndDrop(sourseElement.get(1), target).build().perform();
	    //Thread.sleep(1000);
	    //act.dragAndDrop(sourseElement.get(3), target).build().perform();
	    for(int i=0; i<sourseElement.size();i++) {
	    	performDragandDrop(act,sourseElement.get(i),target);
	    	Thread.sleep(1000);
	    }
	}	
       static void performDragandDrop(Actions act,WebElement src,WebElement target) {
    	   act.dragAndDrop(src, target).build().perform();
       }
	

}
