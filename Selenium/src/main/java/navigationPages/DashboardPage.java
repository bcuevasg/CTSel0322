package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class DashboardPage {

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);// Inicializamos los Page Objects/WebElements con page Factory
		// THIS es un keyword de java con el que inicamos que es el
	}

	// Dashboard page Objects/WebElement

	@FindBy(id = "welcome")
	private WebElement welcomeDrpMenu;
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logoutBtn;
	@FindBy(id = "menu_directory_viewDirectory")
	private WebElement directoryBtn;
	

	public void logut() {
		WrapClass.click(welcomeDrpMenu);
		WrapClass.click(logoutBtn);
	}
	
	public void directoryAccess() {
		WrapClass.click(directoryBtn);
	}
}
