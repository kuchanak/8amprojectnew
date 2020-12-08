package objectrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Browser;

public class Homepage  {
	
	static WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (linkText="POPULAR ITEMS") static WebElement popitem;
	@FindBy (xpath ="//*[@id=\"popular_items\"]/div") static WebElement popblock;
	@FindBy (id ="details_16") static WebElement vdtablet;
	@FindBy (id ="details_10") static WebElement vdlaptop;
	@FindBy (id ="details_21") static WebElement vdspekr;
	@FindBy (xpath ="//*[@id=\"Description\"]/h1") static WebElement tablett;
	@FindBy (xpath ="//*[@id=\"Description\"]/h1") static WebElement laptopt;
	@FindBy (xpath ="//*[@id=\"Description\"]/h1") static WebElement spekrt;

	



	
	public static WebElement popularitem() {
		
		return popitem;
	}

public static WebElement popularblock() {
		
		return popblock;
	}

public static WebElement tabletlink() {
	return vdtablet;
}

public static WebElement laptoplink() {
	return vdlaptop;
}

public static WebElement spekrlink() {
	return vdspekr;
}

public static WebElement tablettext() {
	return tablett;
}

public static WebElement laptoptext() {
	return laptopt;
}

public static WebElement spekrtext() {
	return spekrt;
}

}
