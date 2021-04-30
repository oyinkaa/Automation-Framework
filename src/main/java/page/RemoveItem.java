package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveItem {

	WebDriver driver;
	
	public RemoveItem(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.NAME, using="todo[2]") WebElement C_BUTTON;
	@FindBy(how=How.XPATH, using="//input[@value='Remove']") WebElement REMOVE_BUTTON;
	
	public void clickFirstBox() {
		C_BUTTON.click();
	}
	
	
	public void removeItem() {
		REMOVE_BUTTON.click();
	}
	
	
	
	}
