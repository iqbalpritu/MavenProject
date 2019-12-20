package interviewQuestion1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class HowToCountLink extends BaseClass{
	
	
	@Test
	public void LinkCounting() {
		driver.get("file:///C:/ITTraining/MyWebSite.html");
		//driver.get("https://dsebd.org");
		//driver.get("https://www.amazon.com/");
		//driver.get("https://www.ebay.com/");
		//driver.get("https://www.ctlottery.org/");
	

		List<WebElement>link=driver.findElements(By.tagName("a"));
		int totalLink=link.size();
		System.out.println("Total Links are : "+totalLink);
		
		for(int i=0; i<totalLink; i=i+1) {
			System.out.println(i+". "+link.get(i).getText()+"------"+link.get(i).getAttribute("href"));
		}
		//driver.close();
	}

}



