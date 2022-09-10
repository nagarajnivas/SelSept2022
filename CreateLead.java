package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		//To setup a browser driver
		//WebDriverManager.Edgedriver().setup();

		WebDriverManager.chromedriver().setup();
		String driverPath = System.getProperty("Webdriver.chrome.driver");
		System.out.println(driverPath);	
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver1 = new EdgeDriver();

		//Launch the url
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		//To maximize the window:
		 driver.manage().window().maximize();
		 
		 WebElement userName = driver.findElement(By.id("username"));
		 userName.sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Corporation");
		//String name = "Nagarajan";
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nagarajan");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Srinivasan");
		 
		
		 
		 String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(firstName);
		 
		 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select dd = new Select(source);
		 
		 dd.selectByValue("LEAD_CONFERENCE");
		 //Thread.sleep(3000);
		 driver.findElement(By.className("smallSubmit")).click(); 
	//	 driver.close();
		 
	}
	
}
