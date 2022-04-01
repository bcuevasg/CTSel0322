package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSel {
	@Test
	public void selenium_test01() {
		String exePath = "./driver/chromedriver.exe"; // especificar la ruta del ChomeDriver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando las propiedades con la ruta del chrome
																// driver
		WebDriver driver = new ChromeDriver(); // Objeto de webDriver (cuando faltan librerias el IDE las puede agregar
												// automaticamente)
		driver.get("https://www.google.com");
	}

	public void selenium_test02() {
		String exePath = "./driver/chromedriver.exe"; // especificar la ruta del ChomeDriver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando las propiedades con la ruta del chrome
																// driver
		WebDriver driver = new ChromeDriver(); // Objeto de webDriver (cuando faltan librerias el IDE las puede agregar
												// automaticamente)
		driver.get("https://mail.google.com/");
	}
}
