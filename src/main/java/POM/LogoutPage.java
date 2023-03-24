package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	public LogoutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(partialLinkText="Logout")
	public WebElement logoutbutton;
	
	
	public void logoutaction() {
		logoutbutton.click();
	}
}
