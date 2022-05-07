package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commonClasses.WrapClass;

public class DirectoryPage {

	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);// Inicializamos los Page Objects/WebElements con page Factory
		// THIS es un keyword de java con el que inicamos que es el
	}

	@FindBy(id = "searchDirectory_emp_name_empName")
	private WebElement direcSrchFld;
	@FindBy(id = "searchDirectory_job_title")
	private WebElement drpDwnJobTitle;
	@FindBy(id = "searchDirectory_location")
	private WebElement drpDwnLocation;
	@FindBy(id = "searchBtn")
	private WebElement srchBtn;
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	private WebElement searchNameResult1;
	
// Este metodo hace toda la busqueda usando  3 entradas y regresando el valor de text encontrado
	public String doSearch(String name, String jobtitle, String location) {
		
		//Siguientes 2 lineas contienen la forma de los dropdowns en la ventana directory.
		//Select drpJobTitle = new Select(drpDwnJobTitle);
		//Select drpLocation = new Select(drpDwnLocation);
		
		WrapClass.sendKeys(direcSrchFld, name);
		
		WrapClass.selectByTextDrp(drpDwnJobTitle, jobtitle);
		WrapClass.selectByTextDrp(drpDwnLocation, location);
		
		
		//drpJobTitle.selectByVisibleText(jobtitle);
		//drpLocation.selectByVisibleText(location);
		
		
		WrapClass.click(srchBtn);
		
		// Asigna el valor del nombre a un resultado
		String nameResult = searchNameResult1.getText();
		return nameResult;
	}
	
	///
	/////Metodos separados para funcionalidad independiente
	///
	
	public void fillName(String name) {
		WrapClass.sendKeys(direcSrchFld, name);
	}
	
	public void selectJobTitle(String jobtitle) {
		WrapClass.selectByTextDrp(drpDwnJobTitle, jobtitle);
	}
	
	public void selectlocation(String location) {
		WrapClass.selectByTextDrp(drpDwnLocation, location);
	}
	
	public void clickSearch() {
		WrapClass.click(srchBtn);
	}
	
	public boolean namePresentBol(String expectedName) {
		return searchNameResult1.getText().contains((expectedName));
	}
	
	public String namePresentStr(String expectedName) {
		String nameResult = searchNameResult1.getText();
		return nameResult;
		}
	
	
}
