package ProjectOneTestSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5regularexperssions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Salenium Repository\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");	
/* Using   xpath and  CSS regular Expression */ 
		
		// CSS regular expression Syntax - Tagname[Atrribute*='value'] 
		
/*		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("input[id*='login']")).sendKeys("Rama");
		driver.findElement(By.cssSelector("#password")).sendKeys("12243kj35");
		driver.findElement(By.cssSelector("input[class*='signinbtn']")).click();
*/			
	// xPath regular experssions Syntax - //Tagname[Contains(attribute,'value')]
		
		driver.findElement(By.xpath("//a[contains(@title, 'Sign in')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'login')]")).sendKeys("Username");
		driver.findElement(By.xpath("//input[contains(@id, 'pass')]")).sendKeys("pass12345");
		driver.findElement(By.xpath("//input[contains(@title,'Sign')]")).click();
System.out.println(driver.findElement(By.cssSelector("#div_login_error")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"div_login_error\"]")).getText()); 
// Nornal xPath value
		
	}

}
