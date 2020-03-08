import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCaseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello selinium java");
		
		//Selenium Code:
		
		// Create a driver object for chrome Browser
		
		/*  Class name = ChromeDriver 
		
		x Driver = new x(); 
		*/
		
		// First invoke .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Work Directory Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
