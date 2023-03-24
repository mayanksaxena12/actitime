package actime.utilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POM.LogoutPage;
import POM.loginPage;

public class BaseClass {
	public WebDriver driver;
	public ChromeOptions co= new ChromeOptions();
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("The DataBase connection is established.");
		
	}
	
	@BeforeClass
	public void bcConfig() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions ab = co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ab);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("The URL has been navigated");
	}
	
	@BeforeMethod
	public void bmConfig() {
		loginPage login = new loginPage(driver);
		login.loginaction("admin", "manager");
		System.out.println("login is scuessfully");
	}
	
	@AfterMethod
	public void amConfig() {
		LogoutPage logout = new LogoutPage(driver);
		logout.logoutaction();
		System.out.println("Logout is sucessfully");
	}
	
	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("The Browser is Closed.");
	}
	
	@AfterSuite
	public void asConfig() {
		System.out.println("The database Connection is closed");
	}
	
	

}
