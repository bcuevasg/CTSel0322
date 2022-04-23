package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slenium_Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); // 
		
		//Explicit Wait
		WebElement userName = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("btnLogin123")));
	}

}
