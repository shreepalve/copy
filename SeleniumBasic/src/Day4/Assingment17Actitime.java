package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment17Actitime {

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
    d.findElement(By.className("createNewProject")).click();
    d.findElement(By.className("projectNameField")).sendKeys("ShrinivasP");
    d.findElement(By.cssSelector("div.sectionDetails>div.customerContainer>div.customerSelectorPlaceholder>div>div>:nth-child(3)")).click();
    d.findElement(By.cssSelector("div[class=customerContainer]>:nth-child(2)>div>:nth-child(2)>div>div>div>:nth-child(3)")).click();
    d.findElement(By.cssSelector("input[class=inputFieldWithPlaceholder]")).sendKeys("Testing");
    d.findElement(By.cssSelector("td.billingTypeCell>div.typeOfWorkButton>div")).click();
    d.findElement(By.cssSelector("td.billingTypeCell>div>div>div>div>div>:nth-child(11)>div")).click();
    d.findElement(By.cssSelector("#createProjectPopup_content>div.basicLightboxFooter>:nth-child(2)>:nth-child(3)>div>div[class=components_button_label]")).click();
    d.findElement(By.cssSelector("div.taskRowsTableContainer>table>tbody>tr>td.selection>div>div")).click();
    d.findElement(By.cssSelector("div.delete.button")).click();
    d.findElement(By.cssSelector("span.submitTitle.buttonTitle")).click();
}
}
/*1. open browser and enter the url https://demo.actitime.com/login.do
2. enter the username and password as admin and manager
3. click on login button
4. click on task tab 
5. validate task page
6. click on "add new" and select "new task"
7. select customer
8. select Project "Android Testing"
9. Task name as "Testing"
10.Type of work is "Testing" 
11. click on "Create Task" button
12. Validate "Testing" task is created or not
13. Select checkbox of Created task "Testing"
14. click on "Delete" but
15. confirm deletion 
16. check "Testing" task is deleted or not
17. logout and close the browser

*/