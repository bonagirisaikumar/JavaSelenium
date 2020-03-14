
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Second Invoke the Crome .exe file */
		System.setProperty("webdriver.chrome.driver", "C:\\Work Directory Selenium\\chromedriver.exe");
		// First Create Driver Object for ChromeBrowser (Here C-Browser is Class)
		
	/*	Syntax : ChromeDriver driver=new ChromeDriver();*/
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:\\www.google.com");
		System.out.println(driver.getTitle()); // We use this method to validate Title of the page
		
		System.out.println(driver.getCurrentUrl()); // We use this mehod to validate the URL correctness
		
	System.out.println(driver.getPageSource()); // When Right Click Disabled we use this method to get page source.
		
		driver.get("https:\\www.facebook.com");
	//	driver.navigate().back(); // Used to Navigate back
		
	//	driver.navigate().forward(); // Used to Navigate Forward
		
		//driver.close(); // Close is a metd to close current opened window.
		
	/*	driver.quit(); // Quit is method to close all opened windows including child windows. */
				
		driver.findElement(By.id("email")).sendKeys("This is my First Code");
		
		driver.findElement(By.name("pass")).sendKeys("Thiss is my code");
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		
	driver.close();
		
		
	}

}
