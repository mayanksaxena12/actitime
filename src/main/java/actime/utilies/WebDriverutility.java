package actime.utilies;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverutility {

	public void waitForTitleToDisplay(WebDriver driver, String title) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public void selectOptionFromDropdown(WebElement element, String option) {
		Select select = new Select(element);
		select.selectByVisibleText(option);
	}

}
