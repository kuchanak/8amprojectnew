package objectrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buyproduct {

	static WebDriver driver;
	public Buyproduct(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="details_16") static WebElement itemlink;
	@FindBy(name="save_to_cart") static WebElement cart;
	@FindBy(id="menuCart") static WebElement mcart;
	@FindBy(id="checkOutButton") static WebElement cout;
	@FindBy(name="usernameInOrderPayment") static WebElement uname;
	@FindBy(name="passwordInOrderPayment") static WebElement pwd;
	@FindBy(id="login_btnundefined") static WebElement login;
	@FindBy(id="next_btn") static WebElement nextb;
	@FindBy(name="safepay_username") static WebElement unamespay;
	@FindBy(name="safepay_password") static WebElement pwdspay;
	@FindBy(id="pay_now_btn_SAFEPAY") static WebElement payn;
	@FindBy(xpath="//*[@id=\"orderPaymentSuccess\"]/p") static WebElement orderdetails;
	
	public static WebElement tabletlink() {
		
		return itemlink;
	}

public static WebElement addtocart() {
	
	return cart;
}

public static WebElement menucart() {
	
	return mcart;
}	
	
public static WebElement checkoutbutton() {
	
	return cout;
}
public static WebElement username() {
	
	return uname;
}
public static WebElement password() {
	
	return pwd;
}

public static WebElement login() {
	
	return login;
}
	
	
public static WebElement nextbutton() {
	
	return nextb;
}

public static WebElement safepayusername() {
	
	return unamespay;
}

public static WebElement safepaypwd() {
	
	return pwdspay;
}

public static WebElement paybutton() {
	
	return payn;
}

public static WebElement orderdetailstrack() {
	
	return orderdetails;
}


}
