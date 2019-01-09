package common_Functions;

import org.openqa.selenium.WebElement;

public class WebPopUpMessage {
		public static String checkMessage(WebElement popUp){
			return popUp.getText();
		}
	}
