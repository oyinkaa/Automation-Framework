package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBox {

WebDriver driver;
	
	public CheckBox(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how=How.NAME, using="todo[0]") WebElement TECH_BUTTON;
	//@FindBy(how=How.NAME, using="todo[1]") WebElement MUSIC_BUTTON;
	@FindBy(how=How.XPATH, using="//input[@onclick='checkAll();']") WebElement TOGGLE_BUTTON;

	public void clickFirstBox() {
		TECH_BUTTON.click();
	}
	
	public void clickSecondBox() {
		//MUSIC_BUTTON.click();
		
	}
	
	public void clickToggle() {
		TOGGLE_BUTTON.click();
		
	}

	
	
	
	





}
