package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin {

	final String signUp = "//*[@id=\"js-social__signup-tab\"]/span";
	
	final String signUp_email = "//*[@id=\"email\"]";
	
	final String signUp_passWord = "//*[@id=\"password\"]";
	
	final String signUp_signUpNow = "//*[@id=\"social--signup--submit\"]";
	
	final String signIn_email = "//*[@id=\"signin-email\"]";
	
	final String signIn_passWord = "//*[@id=\"signin-password\"]";
	
	final String signIn_signInNow = "//*[@id=\"signInSubmit\"]";
	

	@FindBy(xpath = signUp)
	public WebElement SignUp;
	
	@FindBy(xpath = signUp_email)
	public WebElement SignUp_email;
	
	@FindBy(xpath = signUp_passWord)
	public WebElement SignUp_passWord;
	
	@FindBy(xpath = signUp_signUpNow)
	public WebElement SignUp_signUpNow;

	@FindBy(xpath = signIn_email)
	public WebElement SignIn_email;
	
	@FindBy(xpath = signIn_passWord)
	public WebElement SignIn_passWord;
	
	@FindBy(xpath = signIn_signInNow)
	public WebElement SignIn_signInNow;
}
