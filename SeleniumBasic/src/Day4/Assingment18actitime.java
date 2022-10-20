package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment18actitime {
		public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", 
	    		"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	    WebDriver d=new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    d.get("https://demo.actitime.com/login.do");
	    d.findElement(By.id("username")).sendKeys("admin");
	    d.findElement(By.name("pwd")).sendKeys("manager");
	    d.findElement(By.cssSelector("tr>:nth-child(3)>a>div")).click();
	    d.findElement(By.id("container_tasks")).click();
	    d.findElement(By.cssSelector("div>div.title.ellipsis")).click();
	    d.findElement(By.className("createNewTasks")).click();
	    d.findElement(By.cssSelector("div.selectorWithPlaceholderContainer>div>div>:nth-child(3)")).click();
	    d.findElement(By.)
}
}