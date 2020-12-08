package pack1;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.Exceltestdata;
import commonmethods.Extendreport;
import objectrep.Homepage;
import testbase.Browser;

public class Popularitemstest extends Browser  {
	
	
	static Homepage hp ;
	@BeforeTest
	public static void config() {
		Extendreport.setup();
		
	}
	
	
	@BeforeMethod
	public static void openbrowser() throws Exception {
		
		Browser.launchbrowser();
		
		
	}
	
	@Test
	public static void atablet() throws IOException, InterruptedException {
		 hp = new Homepage(driver);
		Thread.sleep(10000);
		hp.popularitem().click();
		Thread.sleep(5000);

		hp.tabletlink().click();
		String actualtablettext=Homepage.tablettext().getText();
		//String expectedtablettext=Exceltestdata.readdata(3, 0);
		if(actualtablettext.contains(Exceltestdata.readdata(3, 0))){
			
			Exceltestdata.writedata(3, 1, "valid data");
			Extendreport.pass();
		}else {
			
			Exceltestdata.writedata(3, 1, "in valid data");
			Extendreport.fail();
			
		}
		
				
		}
		
	@Test
	public static void laptop() throws IOException, InterruptedException {
		 hp = new Homepage(driver);

		Thread.sleep(10000);
		hp.popularitem().click();
		hp.laptoplink().click();
		String actuallaptoptext=Homepage.laptoptext().getText();
		
		//String expectedlaptoptext=Exceltestdata.readdata(1, 0);
		if(actuallaptoptext.contains(Exceltestdata.readdata(1, 0))){
			
			Exceltestdata.writedata(1, 1, "valid data");
			Extendreport.pass();
		}else {
			
			Exceltestdata.writedata(1, 1, "in valid data");
			Extendreport.fail();
			
		}
				
		
	}
		
	
	@Test
	public static void spkr() throws IOException, InterruptedException {
		 hp = new Homepage(driver);
		
		Thread.sleep(10000);
		hp.popularitem().click();
		hp.spekrlink().click();
		String actualspkrtext=Homepage.spekrtext().getText();
		
		//String expectedapkrtext=Exceltestdata.readdata(2, 0);
		if(actualspkrtext.contains(Exceltestdata.readdata(2, 0))){
			
			Exceltestdata.writedata(2, 1, "valid data");
			Extendreport.pass();
		}else {
			
			Exceltestdata.writedata(2, 1, "in valid data");
			Extendreport.fail();
			
		}
		
	}
	
	@AfterMethod
	public static void closebrowser() {
driver.close();		
	}
	
	
	}
	


