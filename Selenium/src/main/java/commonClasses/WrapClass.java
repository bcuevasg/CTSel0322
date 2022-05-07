package commonClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WrapClass {

	public static void sendKeys(WebElement WebelEmentUI, String textToSend) {
		WebelEmentUI.sendKeys(textToSend);
	}

	public static void click(WebElement WebElementUI) {
		WebElementUI.click();
	}

	// Agrego el dropdown selector para cualquier ventana
	public static void selectByTextDrp(WebElement WebELementUI, String textToSelect) {
		Select dropdown = new Select(WebELementUI);
		dropdown.selectByVisibleText(textToSelect);
	}

	// Este metodo sera el encargado de tomar el screenshot dependiendo el paso en
	// el que estemos.
	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		//Toma el screenshot de la pagina sin formato
		File srcFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		//Establecer Ruta donde se guarda el screenshot
		String screenshotPath = "./test-output/ExecutionResults";
		
		
		
		try {
			FileHandler.createDir(new File(screenshotPath));
			FileHandler.copy(srcFile, new File(screenshotPath + File.separator + testCaseName + ".png"));			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("El folder de screenshot no pudo ser creado");
			e.printStackTrace();
		}
		
	}

}
