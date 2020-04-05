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
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// by class, ID and name   
/*		driver.findElement(By.id("username")).sendKeys("Saikumar.bonagiri");  	// Element finding using ID
	    driver.findElement(By.name("pw")).sendKeys("Password");					// Element finding using name
		driver.findElement(By.className("button r4 wide primary")).click();		// Error -because compound classes are not allowed 
*/
		// by manual xpath configuration  syntax //tagname[@attribute='value']
		
/*		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sa12345633");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		driver.close();
*/
		// xPath Syntax modification to accept all inputs choosen  by replacing "Tagname" with '*'
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("username");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Sa12345633");
		driver.findElement(By.xpath("//*[@name='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		
		
		//driver.quit();
			
	}

}
