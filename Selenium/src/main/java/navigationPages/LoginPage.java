package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);// Inicializamos los Page Objects/WebElements con page Factory
		// THIS es un keyword de java con el que inicamos que es el
	}

	@FindBy(id = "txtUsername")
	private WebElement userNameTxt;
	@FindBy(id = "txtPassword")
	private WebElement passwordTxt;
	@FindBy(id = "btnLogin")
	private WebElement btnLogin;

	public void login(String user, String password) {
		WrapClass.sendKeys(userNameTxt, user);
		WrapClass.sendKeys(passwordTxt, password);
		WrapClass.click(btnLogin);
	}
}
