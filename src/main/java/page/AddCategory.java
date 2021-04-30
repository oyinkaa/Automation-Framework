package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategory extends BasePage {

WebDriver driver;
	
	public AddCategory(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.XPATH, using="//input[@name='data']") WebElement ADD_CATEGORY_FIELD;
	@FindBy(how=How.XPATH, using="//input[@value='Add']") WebElement ADD_BUTTON;
	@FindBy(how=How.XPATH, using="//select[@name='due_month']") WebElement JAN_BUTTON;
	@FindBy(how=How.XPATH, using="//button[text()='Set SkyBlue Background']") WebElement BLUE_BACKGROUND_BUTTON;
	@FindBy(how=How.XPATH, using="//button[text()='Set White Background']") WebElement WHITE_BACKGROUND_BUTTON;
	

	public void insertCategory(String category) {
		ADD_CATEGORY_FIELD.sendKeys(category);
	}
	
	
	public void addCategory() {
		ADD_BUTTON.click();
	}
	
	public void validateMonths(String Months) {
		selectDropDown(JAN_BUTTON, Months);
		}
	
	public void setAsBlue() {
		waitForElement(driver,7,BLUE_BACKGROUND_BUTTON);
		BLUE_BACKGROUND_BUTTON.click();
		}
	
	public void setAsWhite() {
		WHITE_BACKGROUND_BUTTON.click();
			
		}
		
	
	









}
