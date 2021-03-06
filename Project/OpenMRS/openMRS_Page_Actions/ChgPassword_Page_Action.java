package openMRS_Page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common_Functions.WebButton;
import common_Functions.WebElementCommon;
import common_Functions.WebPopUpMessage;
import common_Functions.WebTextBox;
import openMRS_Page_Locators.ChgPassword_Page_Locator;
import openMRS_Page_Locators.Login_Page_Locator;

public class ChgPassword_Page_Action {
	WebDriver driver = null;
	ChgPassword_Page_Locator chgPwPL = null;
	public ChgPassword_Page_Action(WebDriver driver){
		this.driver = driver;
		chgPwPL = new ChgPassword_Page_Locator(driver);
	}
	
	public void enterPassword(String user){
		WebElement passEle = chgPwPL.getpassword();
		if(WebElementCommon.webElementPresent(passEle)){
			WebTextBox.sendInput(passEle, user);
		}
	}
	
	public void enternewPassword(String pass){
		WebElement npassEle = chgPwPL.getnewpassword();
		if(WebElementCommon.webElementPresent(npassEle)){
			WebTextBox.sendInput(npassEle, pass);
		}
	}
	
	public void enterconfPassword(String pass){
		WebElement cpassEle = chgPwPL.getnewpassword();
		if(WebElementCommon.webElementPresent(cpassEle)){
			WebTextBox.sendInput(cpassEle, pass);
		}
	}
	
	public void clickSave(){
		WebElement btnSve = chgPwPL.getsave();
		if(WebElementCommon.webElementPresent(btnSve)){
			if(WebElementCommon.webElementClickble(btnSve)){
				WebButton.clickBtn(btnSve);
			}
		}
	}
	
	public String checkMsg(){
		String message = "";
		WebElement msgPop = chgPwPL.geterrMsg();
		if(WebElementCommon.webElementPresent(msgPop)){
				message = WebPopUpMessage.checkMessage(msgPop);
		}
		return message;  // message
	}
	
	public String passUpdateFailPopUpMsg(String pass, String npass, String cpass){
		String message="";
		try {
			enterPassword(pass);
			enternewPassword(npass);
			enterconfPassword(cpass);
			clickSave();
			message = checkMsg();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return message;
	}
}
