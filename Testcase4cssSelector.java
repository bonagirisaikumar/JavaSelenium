package ProjectOneTestSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Salenium Repository\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");	
		
		driver.findElement(By.cssSelector("#email")).sendKeys("Saikumar");
		driver.findElement(By.cssSelector("#pass")).sendKeys("a12334");
		driver.findElement(By.cssSelector("#u_0_b")).click();
		
	}

}
