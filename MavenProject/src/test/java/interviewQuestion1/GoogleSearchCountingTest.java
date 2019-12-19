package interviewQuestion1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;



public class GoogleSearchCountingTest extends BaseClass{
	
	@Test
	public void GoogleSearch() throws InterruptedException{
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Dhaka");
	Thread.sleep(1000);	
	
	List<WebElement> List=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	System.out.println("Total search link list are : "+List.size());
	
	for(int i=0; i<List.size(); i=i+1) {
		System.out.println(List.get(i).getText());
		
		if(List.get(i).getText().equals("Dhaka stock")) 
		{
			List.get(i).click();
			break;
		}

	}
	
	}
}
