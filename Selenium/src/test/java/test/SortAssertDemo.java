package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SortAssertDemo {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void verificarTitulo() {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		String badTitle1 = "OrangeHRM_5";
		String badTitle2 = "OrandeASD";
		
		
		softAssert.assertEquals(actualTitle, badTitle1);
		softAssert.assertEquals(actualTitle, badTitle2);
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		softAssert.assertAll();

	}
}
