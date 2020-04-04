package ProjectOneTestSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* Elements Inspector Practice  by ID, name and className */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Salenium Repository\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		  
		driver.findElement(By.id("username")).sendKeys("Saikumar.bonagiri");  	// Element finding using ID
	    driver.findElement(By.name("pw")).sendKeys("Password");					// Element finding using name
		driver.findElement(By.className("button r4 wide primary")).click();		// Error -because compound classes are not allowed 
		driver.close();
		//driver.quit();
			
	}

}
