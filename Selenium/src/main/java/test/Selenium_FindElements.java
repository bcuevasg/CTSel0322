package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); // Extiende la pantalla al maximo

		// Obteniendo objeto/ WebElements de la pagina web para manipular
		WebElement userName = driver.findElement(By.id("txtUsername")); // Creando este objeto para manipular similar
																		// para los objetos siguientes
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));

		// Login
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(2000);

		// FIND ELEMENTS para menus que tienen mismo identificador pero tienen multiples
		// opciones (necesario crear lista)
		List<WebElement> firstLvlMenu = driver.findElements(By.className("firstLevelMenu"));
		System.out.println("El numero de elementos en el menu es: " + firstLvlMenu.size());
		// String primerMenu = firstLvlMenu.get(0).getText();
		// System.out.println(primerMenu);

		for (int i = 0; i < firstLvlMenu.size(); i++) {
			System.out.println("El valor en la posicion: " + i + " es: " + firstLvlMenu.get(i).getText());
		}
	}

}
