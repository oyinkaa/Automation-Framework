package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAlItems {

	WebDriver driver;
		
	public RemoveAlItems(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how=How.XPATH, using="//input[@onclick='checkAll();']") WebElement TOGGLE_BUTTON;
	@FindBy(how=How.XPATH, using="//input[@value='Remove']") WebElement REMOVE_BUTTON;

	public void clickToggle() {
		TOGGLE_BUTTON.click();
		
	}

	public void removeItem() {
		REMOVE_BUTTON.click();
	}

}
