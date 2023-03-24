package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage  {
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	public WebElement usernameTextFld;
	
	@FindBy(name ="pwd")
	public WebElement passwordTextFld;
	
	@FindBy(xpath = "//div[text()='Login ']")
	public WebElement loginbutton;
	
	public void loginaction(String username,String password) {
		usernameTextFld.sendKeys(username);
		passwordTextFld.sendKeys(password);
		loginbutton.click();
	}

}
