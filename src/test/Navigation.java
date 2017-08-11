package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navigation {
	final String signIn = "//*[@id=\"js-header-nav\"]/ul/li[5]/div[2]/a";
	
	final String buyingNewAndUsed = "//*[@id=\"js-header-nav\"]/ul/li[1]/a/span";
	
	final String findCarsForSale = "//*[@id=\"top-nav__buying\"]/li[1]/a";
	
	@FindBy (xpath = signIn)
	public WebElement SignIn;
	
	@FindBy (xpath = buyingNewAndUsed)
	public WebElement BuyingNewAndUsed;
	
	@FindBy (xpath = findCarsForSale)
	public WebElement FindCarsForSale;

}
