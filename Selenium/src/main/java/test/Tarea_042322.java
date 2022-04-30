package test;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Tarea_042322 {

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

		// for (int i = 0; i < firstLvlMenu.size(); i++) {
		// System.out.println("El valor en la posicion: " + i + " es: " +
		// firstLvlMenu.get(i).getText());
		// }
		
		//seleccionando la opcion del Directory 
		firstLvlMenu.get(8).click();

		// Declarando Search field por nombre en directorio
		WebElement searchName = driver.findElement(By.id("searchDirectory_emp_name_empName"));

		// Declarando el dorpdown para el jobTitle-Directory
		Select drpdwnJobTitle = new Select(driver.findElement(By.id("searchDirectory_job_title")));

		// Declarando el dorpdown para el Location-Direcotry
		Select drpdwnDirctryLocation = new Select(driver.findElement(By.id("searchDirectory_location")));

		searchName.sendKeys("Nathan");
		// Thread.sleep(2000);
		
		drpdwnJobTitle.selectByVisibleText("Sales Representative");
		Thread.sleep(2000);
		
		drpdwnDirctryLocation.selectByVisibleText("  United States");
		Thread.sleep(2000);

		// Declarando Search button del Directory.
		WebElement direcotrySearch = driver.findElement(By.id("searchBtn"));

		direcotrySearch.click();

		
		//
		String searchNameResult = driver.findElement(By.id("resultTable")).getText();
		String searchNameResult2 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")).getText();// same as line 78 but with xpath
		
		
		
		// System.out.println(searchNameResult);

		boolean msj = searchNameResult2.contains("Nathan Elliot");

		if (msj) {
			System.out.println("El nombre de la persona SI es Nathan Elliot");
		} else {
			System.out.println("ERROR: El nombre de la persona NO es Nathan Elliot");
		}

		System.out.println("La informacion encontrada fue:\n" + searchNameResult2);

		// WebElement closeWait = new WebDriverWait(driver,
		// Duration.ofSeconds(10)).until(ExpectedConditions.textMatches(searchNameResult,
		// "Nathan Elliot"));

		driver.quit();
	}

}
