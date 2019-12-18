package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
	
		
		//System.setProperty("webdriver.chrome.driver", "C:\\ITTraining\\AllDriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
	}
	@AfterTest
	public void CloseBrowser() {
	driver.close();
	}

}
