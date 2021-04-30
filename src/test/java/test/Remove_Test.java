package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CheckBox;
import page.RemoveItem;
import util.BrowserFactory;

public class Remove_Test {

	WebDriver driver;
	
	@Test
	public void shouldBeAbleToRemove() {
	

		driver = BrowserFactory.init();
		
		CheckBox checkBox = PageFactory.initElements(driver, CheckBox.class);
		checkBox.clickFirstBox();
		checkBox.clickSecondBox();
		checkBox.clickToggle();
		
		RemoveItem removeItem = PageFactory.initElements(driver, RemoveItem.class);
		removeItem.clickFirstBox();
		removeItem.removeItem();




	}


}
