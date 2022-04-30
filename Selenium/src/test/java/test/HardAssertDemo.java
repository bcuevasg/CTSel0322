package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {
	@Test
	public void verificarTituloDePagina() {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();// comando que busca el titulo de la pagina en cuanto entra
		String expectedTitle = "OrangeHRM_5"; // Este es el valor a buscar por el title
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);		
		
		boolean titulo = actualTitle.equals(expectedTitle);
		
		Assert.assertTrue(titulo);
		System.out.println(titulo);
		
	}
}
