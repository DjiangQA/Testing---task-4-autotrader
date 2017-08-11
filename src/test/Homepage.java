package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
final String postCode_search = "//*[@id=\"postcode\"]";

final String distance_search = "//*[@id=\"radius\"]";

final String used_search = "//*[@id=\"searchVehicles\"]/div/div[3]/fieldset[2]/label";
final String nearlyNew_search = "//*[@id=\"searchVehicles\"]/div/div[3]/fieldset[3]/label";
final String new_search = "//*[@id=\"searchVehicles\"]/div/div[3]/fieldset[4]/label";

final String make_search = "//*[@id=\"searchVehiclesMake\"]";

final String model_search = "//*[@id=\"searchVehiclesModel\"]";

final String minP_search = "//*[@id=\"searchVehiclesPriceFrom\"]";

final String maxp_search = "//*[@id=\"searchVehiclesPriceTo\"]";

final String searchNow_search = "//*[@id=\"search\"]/span";

final String home = "//*[@id=\"js-header-nav\"]/a";

final String user_info = "//*[@id=\"js-header-nav\"]/ul/li[5]/div[1]/a/i";

final String sign_out = "//*[@id=\"ursSignoutForm\"]/button";


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
	
	@FindBy (xpath = home)
	public WebElement Home;
	
	@FindBy (xpath = user_info)
	public WebElement User_info;
	
	@FindBy (xpath = sign_out)
	public WebElement Sign_out;
	

}
