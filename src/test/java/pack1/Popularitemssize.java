package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectrep.Homepage;
import testbase.Browser;


public class Popularitemssize extends Browser {
	//static WebDriver driver;
	
	@Test
	public static void itemscount() throws Exception {
		
		Browser.launchbrowser();	
		Thread.sleep(10000);

		Homepage hp= new Homepage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(hp.popularitem()));
		
		hp.popularitem().click();
		int itemsize=hp.popularblock().findElements(By.tagName("div")).size();
		
		if(itemsize==3) {
			
			System.out.println("total number of popular items = "+itemsize);
			
			Assert.assertTrue(true);
			
		}else {
			System.out.println("total number of popular items = "+itemsize);

			Assert.assertTrue(false);

			
		}
		
	
	int textsize=hp.popularblock().findElements(By.tagName("p")).size();	
System.out.println(textsize);

	for(int i=0;i<textsize;i++) {
		String populartext=hp.popularblock().findElements(By.tagName("p")).get(i).getText();
		System.out.println(populartext);
	}
	
	
		
	}
	

}
