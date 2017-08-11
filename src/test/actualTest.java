package test;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class actualTest {

	private WebDriver CMDR;

	Actions actions;

	private Navigation N;
	private Signin S;
	private Homepage H;
	private Findcarsforsale F;

	private static ExtentReports report;
	private static ExtentTest test1;
	private static ExtentTest test2;
	private static ExtentTest test3;
	private static ExtentTest test4;
	private static ExtentTest test5;
	private static ExtentTest test6;
	private static ExtentTest test7;
	private static ExtentTest test8;
	private static ExtentTest test9;
	private static ExtentTest test10;

	private static String reportFilePath = "Report.html";

	String targetWebsite = "http://www.autotrader.co.uk/";

	@BeforeClass
	public static void beforesetup() {
		report = new ExtentReports();
		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(reportFilePath);
		extentHtmlReporter.config().setReportName("Test1_report");
		extentHtmlReporter.config().setDocumentTitle("Test1_report");
		report.attachReporter(extentHtmlReporter);
		test1 = report.createTest("Test1");
		test2 = report.createTest("Test2");
		test3 = report.createTest("Test3");
		test4 = report.createTest("Test4");
		test5 = report.createTest("Test5");
		test6 = report.createTest("Test6");
		test7 = report.createTest("Test7");
		test8 = report.createTest("Test8");
		test9 = report.createTest("Test9");
		test10 = report.createTest("Test10");
	}

	@Before
	public void setUp() {

		CMDR = new ChromeDriver();
		actions = new Actions(CMDR);
		CMDR.manage().window().maximize();
		test1.info("Test website:" + targetWebsite);

		N = PageFactory.initElements(CMDR, Navigation.class);
		S = PageFactory.initElements(CMDR, Signin.class);
		H = PageFactory.initElements(CMDR, Homepage.class);
		F = PageFactory.initElements(CMDR, Findcarsforsale.class);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(CMDR).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(100, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);

		CMDR.navigate().to(targetWebsite);

	}

	SpreadSheetReader sheetReader = new SpreadSheetReader(System.getProperty("user.dir") + "\\userData.xlsx");
	List<String> selectorP = sheetReader.readRow(7, "UserInfo");

	String personSelector = selectorP.get(1);
	int person = (int) Float.parseFloat(personSelector);

	List<String> selectorC = sheetReader.readRow(6, "CarInfo");

	String carSelector = selectorC.get(1);
	int car = (int) Float.parseFloat(carSelector);

	List<String> row = sheetReader.readRow(person, "UserInfo");

	String title = row.get(1);
	String firstName = row.get(2);
	String lastName = row.get(3);
	String emailAddress = row.get(4);
	String passWord = row.get(5);
	String DOB_d = row.get(6);
	String DOB_m = row.get(7);
	String DOB_y = row.get(8);
	String address = row.get(9);
	String city = row.get(10);
	String postCode = row.get(11);
	String mobile = row.get(12);
	String alias = row.get(13);

	List<String> row2 = sheetReader.readRow(car, "CarInfo");
	String Condition = row2.get(1);
	String Make = row2.get(2);
	String Model = row2.get(3);
	String Min_Price = row2.get(4);
	String Max_Price = row2.get(5);

	@Ignore
	@Test
	public void test1_accountcreation() {

		actions.moveToElement(N.SignIn).click().perform();
		actions.moveToElement(S.SignUp).click().perform();
		actions.moveToElement(S.SignUp_email).click().sendKeys(emailAddress).perform();
		actions.moveToElement(S.SignUp_passWord).click().sendKeys(passWord).perform();
		actions.moveToElement(S.SignUp_signUpNow).click().perform();

		// test1.fail("Not yet been implemented");
		test1.info("Test Status:" + test1.getStatus());
		// fail("Not yet implemented");

	}

	@Ignore
	@Test
	public void test2_login() {

		actions.moveToElement(N.SignIn).click().perform();
		actions.moveToElement(S.SignIn_email).click().sendKeys(emailAddress).perform();
		actions.moveToElement(S.SignIn_passWord).click().sendKeys(passWord).perform();
		actions.moveToElement(S.SignIn_signInNow).click().perform();

		// test2.fail("Not yet been implemented");
		test2.info("Test Status:" + test2.getStatus());
		// fail("Not yet implemented");
	}
	
	
	@Test
	public void test3_carSearch1() throws InterruptedException {

		actions.moveToElement(H.PostCode_search).click().sendKeys(postCode).perform();

		actions.moveToElement(H.Distance_search).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

		if (Condition.equals("Used") | Condition.equals("used")) {
			actions.moveToElement(H.NearlyNew_search).click().moveToElement(H.New_search).click().perform();
		} else if (Condition.equals("Nearly new") | Condition.equals("nearly new")) {
			actions.moveToElement(H.Used_search).click().moveToElement(H.New_search).click().perform();
		} else if (Condition.equals("New") | Condition.equals("new")) {
			actions.moveToElement(H.Used_search).click().moveToElement(H.NearlyNew_search).click().perform();
		}

		actions.moveToElement(H.Make_search).click().sendKeys(Make).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		actions.moveToElement(H.Model_search).click().sendKeys(Model).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		actions.moveToElement(H.MinP_search).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		actions.moveToElement(H.Maxp_search).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		actions.moveToElement(H.SearchNow_search).click().perform();

		Thread.sleep(5000);

		// test3.fail("Not yet been implemented");
		test3.info("Test Status:" + test3.getStatus());
		// fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void test4_carsearch2() throws InterruptedException {

		actions.moveToElement(N.BuyingNewAndUsed).perform();
		;
		actions.moveToElement(N.FindCarsForSale).click().perform();
		
		

		actions.moveToElement(F.PostCode_search).click().sendKeys(postCode).perform();

		actions.moveToElement(F.Distance_search).click().perform();
		
		for (int x = 0; x < 14 ; x++)
		{
			actions.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(100);
		}
		actions.sendKeys(Keys.ENTER).perform();

		if (Condition.equals("Used") | Condition.equals("used")) {
			actions.moveToElement(F.NearlyNew_search).click().moveToElement(F.New_search).click().perform();
		} else if (Condition.equals("Nearly new") | Condition.equals("nearly new")) {
			actions.moveToElement(F.Used_search).click().moveToElement(F.New_search).click().perform();
		} else if (Condition.equals("New") | Condition.equals("new")) {
			actions.moveToElement(F.Used_search).click().moveToElement(F.NearlyNew_search).click().perform();
		}

		actions.moveToElement(F.Make_search).click().sendKeys(Make).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		actions.moveToElement(F.Model_search).click().sendKeys(Model).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		actions.moveToElement(F.MinP_search).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		actions.moveToElement(F.Maxp_search).click().perform();
		
		for (int i = 0; i < 26; i++)
		{
			actions.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(100);
		}
		
		actions.sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.Year).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.Milleage).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.FuelType).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.MaxEngineSize).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.FuelConsumption).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.Acceleration).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.GearBox).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.Co2).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.Doors).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.MinSeats).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.MaxSeats).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.InsuranceGroup).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.AnnualTax).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.Colour).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.TradeType).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		actions.moveToElement(F.SearchNow_search).click().perform();
		
		Thread.sleep(5000);

		// test4.fail("Not yet been implemented");
		test4.info("Test Status:" + test4.getStatus());
		// fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void test5_logout() throws InterruptedException {

		actions.moveToElement(N.SignIn).click().perform();
		actions.moveToElement(S.SignIn_email).click().sendKeys(emailAddress).perform();
		actions.moveToElement(S.SignIn_passWord).click().sendKeys(passWord).perform();
		actions.moveToElement(S.SignIn_signInNow).click().perform();

		actions.moveToElement(H.Home).click().perform();
		actions.moveToElement(H.User_info).moveToElement(H.Sign_out).click().perform();

		// test5.fail("Not yet been implemented");
		test5.info("Test Status:" + test5.getStatus());
		// fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void test6() {

		test6.fail("Not yet been implemented");
		test6.info("Test Status:" + test6.getStatus());
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void test7() {

		test7.fail("Not yet been implemented");
		test7.info("Test Status:" + test7.getStatus());
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void test8() {

		test8.fail("Not yet been implemented");
		test8.info("Test Status:" + test8.getStatus());
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void test9() {

		test9.fail("Not yet been implemented");
		test9.info("Test Status:" + test9.getStatus());
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void test10() {

		test10.fail("Not yet been implemented");
		test10.info("Test Status:" + test10.getStatus());
		fail("Not yet implemented");
	}

	@After
	public void after() {

		CMDR.quit();
		report.flush();
	}

	@AfterClass
	public static void afterclass() {

	}
}

/*
 * test.log( Status.INFO, "End test Snapshot : " +
 * test.addScreenCaptureFromPath(ScreenShot.take(CMDR,
 * "Constrain movement end of test")));
 * 
 * 
 * 
 * 
 * 
 */
