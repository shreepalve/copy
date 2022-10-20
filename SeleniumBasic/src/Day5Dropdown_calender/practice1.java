package Day5Dropdown_calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice1 {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement d=driver.findElement(By.id("Skills"));
	Select skillElement=new Select(d);
	System.out.println("Dropdown is multiple or not "+skillElement.isMultiple());
	System.out.println("is there already select oprion "+skillElement.getFirstSelectedOption());
    List<WebElement> option=skillElement.getOptions();
    System.out.println("size of dropdown "+option.size());
    int count=1;
    for(int i=0;i<option.size();i++) {
    	System.out.println("option "+count+" "+ option.get(i).getText());
    	count++;
    }
    //select option by index
    skillElement.selectByIndex(4);
    System.out.println(skillElement.getFirstSelectedOption().getText());
    //select option by value
    skillElement.selectByValue("Backup Management");
    System.out.println(skillElement.getFirstSelectedOption().getText());
    //select option by Visible text
    skillElement.selectByVisibleText("Analitics");
    System.out.println(skillElement.getFirstSelectedOption().getText());
    //check the order of skill
    String skillElement1="";
    //get dropdown option name
    for(int i=0;i<option.size();i++) {
   if(option.size()-1!=i){
	   skillElement1=skillElement1 + option.get(i).getText()+", ";
   }else {
	   skillElement1=skillElement1+option.get(i).getText();
   }
   }
    
   String Expected_skillElement="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
   System.out.println("skillElement1 "+skillElement);
   System.out.println("expected_skillName"+Expected_skillElement);
   System.out.println(skillElement1.equals(Expected_skillElement));
    
    
}
}
