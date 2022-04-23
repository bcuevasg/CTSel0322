package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Practica {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();// Extiende la pantalla al maximo

		// Obteniendo objeto/ WebElements de la pagina web para manipular
		WebElement userName = driver.findElement(By.id("txtUsername")); // Creando este objeto para manipular similar para los objetos siguientes
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));

		// Login
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(2000);

		// Metodos del explorador
		// Validacion titulo
		String title = driver.getTitle();
		System.out.println("El titulo es: " + title);

		// Validacion URL actual
		String url = driver.getCurrentUrl();
		System.out.println("La URL actual es: " + url);

		// Metodos de navegacion.
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();

		// Click Assing Leave
		WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
		assignLeaveBtn.click();

		// Verificacion Assing Leave es abierto
		boolean assignBtnExists = driver.findElement(By.id("assignBtn")).isDisplayed(); // Esta Boleano guarda el valor
																						// si el elemnto assignBtn esta
																						// en la pantall sera true, si
																						// no sera un false
		if (assignBtnExists) {
			System.out.println("El button Assign esta presente");
		}

		// Verificar Texto
		String welcomeMsj = driver.findElement(By.id("welcome")).getText();// esta variable guardara la informacion que
																			// este guardada en el elemento welcome por
																			// su ID

		boolean msj = welcomeMsj.contains("Tim");// Contain() es un metodo para comparar 2 strings

		if (msj) {
			System.out.println("El welcome message contiene el nombre de Tim");
		} else {
			System.out.println("ERROR: El welcome message NO contiene el nombre Tim");
		}
		
		//Dropdowns y como setarlos
		Thread.sleep(3000);
		Select drpdwnLeaveType = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		drpdwnLeaveType.selectByVisibleText("CAN - FMLA");
		Thread.sleep(3000);
		drpdwnLeaveType.selectByIndex(9);
		Thread.sleep(2000);

						
		//Como Cerrar browser del WebDriver
		//driver.close();//Cierra ventana actual que el webdriver este utilizando.
		driver.quit();// Cierra todas las ventanas que se haya abierto en la ejecucion.
		
		
	}

}
