package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import actime.utilies.BaseClass;
import actime.utilies.WebDriverutility;

public class ToVerifyTitle extends BaseClass {
	
	
	@Test
	public void ToVerifyPageTitle() {
		String expectedtitle = "Enter";
		
		WebDriverutility WUtilis = new WebDriverutility();
		WUtilis.waitForTitleToDisplay(driver, expectedtitle);
		
		String actualtitle = driver.getTitle();
		
		Assert.assertTrue(actualtitle.contains(expectedtitle));
		
		System.out.println("Title is verified");
	}

}
