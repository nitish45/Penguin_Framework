package openMRS_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChgPassword_Page_Locator {
	WebDriver driver = null;
	public ChgPassword_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id = "oldPassword-field")
	private WebElement password;
	
	public WebElement getpassword(){
		return password;
	}
	
	@FindBy(id = "newPassword-field")
	private WebElement newpassword;
	
	public WebElement getnewpassword(){
		return newpassword;
	}
	
	@FindBy(id = "confirmPassword-field")
	private WebElement confpassword;
	
	public WebElement getconfPassword(){
		return confpassword;
	}
	
	@FindBy(id = "save-button")
	private WebElement save;
	
	public WebElement getsave(){
		return save;
	}
	
	@FindBy(xpath = "//i[@class='icon-remove medium']//following-sibling::p")
	private WebElement errMsg;
	
	public WebElement geterrMsg(){
		return save;
	}
}
