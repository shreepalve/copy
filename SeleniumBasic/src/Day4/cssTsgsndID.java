package Day4;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
	import org.openqa.selenium.WebDriver;  
	import org.openqa.selenium.firefox.FirefoxDriver;  
	import org.openqa.selenium.remote.DesiredCapabilities;  
	  
	public class cssTsgsndID {  
	  
	    public static void main(String[] args) {  
	          
	     // System Property for Gecko Driver   
	    System.setProperty("webdriver.gecko.driver",
	    		"D:\\Workspace\\SeleniumBasic\\Executable\\geckodriver.exe" );  
	          
	       // Initialize Gecko Driver using Desired Capabilities Class  
	        DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
	        capabilities.setCapability("marionette",true);  
	        WebDriver driver= new FirefoxDriver(capabilities);  
	          
	      
	      // Launch Website  
	driver.navigate().to("https//google.com/");  
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);    
	      // Click on the textbox and send value  
	driver.findElement(By.cssSelector("input[placeholder='Search Google or type a URL']")).sendKeys("JavaTpoint");  
	       
	    // Click on the Submit button using click() command  
	driver.findElement(By.cssSelector("button#idOfButton")).click();  
	   
	          
	     //  Close the Browser  
	             driver.close();  
	      
	    }  
}
