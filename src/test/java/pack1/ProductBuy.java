package pack1;

import org.testng.annotations.Test;

import commonmethods.Extendreport;
import objectrep.Buyproduct;
import testbase.Browser;

public class ProductBuy  extends Browser{
	

	@Test
	public static void buyp() throws Exception {
		Extendreport.setup();
		Browser.launchbrowser();
		Buyproduct bp=new Buyproduct(driver);
		Thread.sleep(10000);
		bp.tabletlink().click();
		Thread.sleep(5000);

		bp.addtocart().click();
		bp.menucart().click();
		bp.checkoutbutton().click();
		bp.username().sendKeys("kirank");
		bp.password().sendKeys("0123456kK");
		Thread.sleep(5000);
		bp.login().click();
		Thread.sleep(5000);
		bp.nextbutton().click();
		bp.safepayusername().clear();
		bp.safepayusername().sendKeys("kirank");
		bp.safepaypwd().clear();
		bp.safepaypwd().sendKeys("0123456kK");
		bp.paybutton().click();
		Thread.sleep(5000);
		String Orderdeatils=bp.orderdetailstrack().getText();
		System.out.println(Orderdeatils);
		

		
		
		
		
		
	}

}
