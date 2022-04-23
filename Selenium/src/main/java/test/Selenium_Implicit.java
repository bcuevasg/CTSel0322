package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); // // Extiende la pantalla al maximo 
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement userName = driver.findElement(By.id("txtUsername"));//deberia de aventar error si no encuentra lo buscado en esta linea (txtUsername)

	}

}
