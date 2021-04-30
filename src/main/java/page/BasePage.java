package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void selectDropDown(WebElement elementLocator, String visibleText) {
		Select sel = new Select(elementLocator);
		sel.selectByVisibleText(visibleText);
				
		}
	
	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
}
