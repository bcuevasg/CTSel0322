package directorySearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.GlobalVariables;
import commonClasses.SetupDriver;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;

public class TC_SearchResults {

	WebDriver driver = SetupDriver.setupDriver();

	// LoginPage Object
	LoginPage login = new LoginPage(driver);

	// Dashboard Object
	DashboardPage dashboardPage = new DashboardPage(driver);

	// Directory Object
	DirectoryPage directoryPage = new DirectoryPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_NameValidation() {
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		dashboardPage.directoryAccess();
		directoryPage.doSearch(GlobalVariables.USER_TO_SEARCH, GlobalVariables.JobTitleDirectory,
				GlobalVariables.LocationDirectory);
		String searchNameResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b"))
				.getText();
		Assert.assertEquals(searchNameResult, GlobalVariables.ExpectedName);
		System.out.println(searchNameResult);
	}

	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
