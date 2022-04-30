package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClass {

	 public static void sendKeys(WebElement WebelEmentUI, String textToSend) {
		 WebelEmentUI.sendKeys(textToSend);
	 }
	 
	 public static void click(WebElement WebElementUI) {
		 WebElementUI.click();
	 }
	 
	
}
