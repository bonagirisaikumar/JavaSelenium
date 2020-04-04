package ProjectOneTestSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Salenium Repository\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");	
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("saikumar");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		driver.findElement(By.xpath("//*[@id='identify_email']")).sendKeys("5252725623");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		driver.navigate().back();
		// Now navogating back and click on login by entering username and password 
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("saikumar");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		
			
		driver.close();
	}

}
