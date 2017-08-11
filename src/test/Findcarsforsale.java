package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Findcarsforsale {
	
final String postCode_search = "//*[@id=\"js-known-search-advanced\"]/div[1]/div[1]/input";

final String distance_search = "//*[@id=\"js-known-search-advanced\"]/div[1]/div[1]/div/select";

final String used_search = "//*[@id=\"js-known-search-advanced\"]/div[1]/div[5]/div[1]/label";
final String nearlyNew_search = "//*[@id=\"js-known-search-advanced\"]/div[1]/div[5]/div[2]/label";
final String new_search = "//*[@id=\"js-known-search-advanced\"]/div[1]/div[5]/div[3]/label";

final String make_search = "//*[@id=\"js-known-search-advanced\"]/div[1]/div[6]/div/select";

final String model_search = "//*[@id=\"js-known-search-advanced\"]/div[1]/div[7]/div/select";

final String minP_search = "//*[@id=\"js-known-search-advanced\"]/div[1]/div[8]/div[1]/select";

final String maxp_search = "//*[@id=\"js-known-search-advanced\"]/div[1]/div[8]/div[2]/select";

final String searchNow_search = "//*[@id=\"js-known-search-advanced\"]/div[1]/button";



final String year = "//*[@id=\"js-known-search-advanced\"]/div[2]/div[1]/div[1]/select";

final String milleage = "//*[@id=\"js-known-search-advanced\"]/div[2]/div[1]/div[2]/select";

final String fuelType = "//*[@id=\"js-known-search-advanced\"]/div[3]/div[1]/div[1]/select";

final String maxEngineSize = "//*[@id=\"js-known-search-advanced\"]/div[3]/div[1]/div[2]/select";

final String fuelConsumption = "//*[@id=\"js-known-search-advanced\"]/div[2]/div[2]/div[1]/select";

final String acceleration = "//*[@id=\"js-known-search-advanced\"]/div[2]/div[2]/div[2]/select";

final String gearBox = "//*[@id=\"js-known-search-advanced\"]/div[3]/div[2]/div[1]/select";

final String co2 = "//*[@id=\"js-known-search-advanced\"]/div[3]/div[2]/div[2]/select";

final String doors = "//*[@id=\"js-known-search-advanced\"]/div[2]/div[3]/div[1]/select";

final String minSeats = "//*[@id=\"js-known-search-advanced\"]/div[2]/div[3]/div[2]/select";

final String maxSeats = "//*[@id=\"js-known-search-advanced\"]/div[3]/div[3]/div[1]/select";

final String insuranceGroup = "//*[@id=\"js-known-search-advanced\"]/div[3]/div[3]/div[2]/select";

final String annualTax = "//*[@id=\"js-known-search-advanced\"]/div[2]/div[4]/div[1]/select";

final String colour = "//*[@id=\"js-known-search-advanced\"]/div[2]/div[4]/div[2]/select";

final String tradeType = "//*[@id=\"js-known-search-advanced\"]/div[3]/div[4]/div[1]/select";



@FindBy (xpath = postCode_search)
	public WebElement PostCode_search;

@FindBy (xpath = distance_search)
public WebElement Distance_search;

@FindBy (xpath = used_search)
public WebElement Used_search;

@FindBy (xpath = nearlyNew_search)
public WebElement NearlyNew_search;

@FindBy (xpath = new_search)
public WebElement New_search;

@FindBy (xpath = make_search)
public WebElement Make_search;

@FindBy (xpath = model_search)
public WebElement Model_search;

@FindBy (xpath = minP_search)
public WebElement MinP_search;

@FindBy (xpath = maxp_search)
public WebElement Maxp_search;
	
@FindBy (xpath = searchNow_search)
public WebElement SearchNow_search;


@FindBy (xpath = year)
public WebElement Year;

@FindBy (xpath = milleage)
public WebElement Milleage;

@FindBy (xpath = fuelType)
public WebElement FuelType;

@FindBy (xpath = maxEngineSize)
public WebElement MaxEngineSize;

@FindBy (xpath = fuelConsumption)
public WebElement FuelConsumption;

@FindBy (xpath = acceleration)
public WebElement Acceleration;

@FindBy (xpath = gearBox)
public WebElement GearBox;

@FindBy (xpath = co2)
public WebElement Co2;

@FindBy (xpath = doors)
public WebElement Doors;

@FindBy (xpath = minSeats)
public WebElement MinSeats;

@FindBy (xpath = maxSeats)
public WebElement MaxSeats;

@FindBy (xpath = insuranceGroup)
public WebElement InsuranceGroup;

@FindBy (xpath = annualTax)
public WebElement AnnualTax;

@FindBy (xpath = colour)
public WebElement Colour;

@FindBy (xpath = tradeType)
public WebElement TradeType;
	

}
