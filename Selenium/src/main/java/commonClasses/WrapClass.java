package commonClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WrapClass {

	 public static void sendKeys(WebElement WebelEmentUI, String textToSend) {
		 WebelEmentUI.sendKeys(textToSend);
	 }
	 
	 public static void click(WebElement WebElementUI) {
		 WebElementUI.click();
	 }
	 
//	 public static void drpDownSelect(WebElement WebELementUI) {
	//	 Select WebElementUI = new Select(WebELementUI);
	// }
	 
	
}
