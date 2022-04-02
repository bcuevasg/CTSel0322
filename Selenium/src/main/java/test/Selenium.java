package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "./driver/chromedriver.exe"; // especificar la ruta del ChomeDriver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando las propiedades con la ruta del chrome
																// driver
		WebDriver driver = new ChromeDriver(); // Objeto de webDriver (cuando faltan librerias el IDE las puede agregar
												// automaticamente)
		driver.get("https://www.google.com");
	}

}
