package test;

import java.awt.Checkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CheckBox;
import util.BrowserFactory;

public class CheckBox_Test {

	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToTick() throws Exception {
		
		driver = BrowserFactory.init();
		
		CheckBox checkBox = PageFactory.initElements(driver, CheckBox.class);
		Thread.sleep(2000);
		checkBox.clickFirstBox();
		checkBox.clickSecondBox();
		checkBox.clickToggle();
	}

















}
