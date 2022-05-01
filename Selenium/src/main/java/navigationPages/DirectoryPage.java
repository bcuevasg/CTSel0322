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
	

	public void doSearch(String name, String jobtitle, String location) {
		Select drpJobTitle = new Select(drpDwnJobTitle);
		Select drpLocation = new Select(drpDwnLocation);
		
		WrapClass.sendKeys(direcSrchFld, name);
		drpJobTitle.selectByVisibleText(jobtitle);
		drpLocation.selectByVisibleText(location);
		WrapClass.click(srchBtn);
	}
}
