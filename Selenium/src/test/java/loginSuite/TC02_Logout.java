package loginSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.GlobalVariables;
import commonClasses.SetupDriver;
import navigationPages.DashboardPage;
import navigationPages.LoginPage;

public class TC02_Logout {

	WebDriver driver = SetupDriver.setupDriver();

	// LoginPage Object
	LoginPage login = new LoginPage(driver);
	
	//Dashboard Object
	DashboardPage dashboardPage = new DashboardPage(driver);
	

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC_02() {
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		dashboardPage.logut();
	}
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
