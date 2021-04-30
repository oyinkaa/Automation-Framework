package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategory;
import page.CheckBox;
import page.RemoveAlItems;
import page.RemoveItem;
import util.BrowserFactory;

public class AddCategory_Test {

		WebDriver driver;
			
			@Test
			public void shouldBeAbleToAddCategory() {
			

				driver = BrowserFactory.init();
				
				CheckBox checkBox = PageFactory.initElements(driver, CheckBox.class);
				checkBox.clickFirstBox();
			//	checkBox.clickSecondBox();
				checkBox.clickToggle();
				
				RemoveItem removeItem = PageFactory.initElements(driver, RemoveItem.class);
				removeItem.clickFirstBox();
				removeItem.removeItem();
			
				RemoveAlItems removeAllItems = PageFactory.initElements(driver, RemoveAlItems.class);
				removeAllItems.clickToggle();
				removeAllItems.removeItem();
				
				AddCategory addCategory = PageFactory.initElements(driver, AddCategory.class);
				addCategory.insertCategory("Teaching");
				addCategory.addCategory();
				addCategory.validateMonths("Jan");
				addCategory.validateMonths("Feb");
				addCategory.validateMonths("Mar");
				addCategory.validateMonths("Apr");
				addCategory.validateMonths("May");
				addCategory.validateMonths("Jun");
				addCategory.validateMonths("Jul");
				addCategory.validateMonths("Aug");
				addCategory.validateMonths("Sep");
				addCategory.validateMonths("Oct");
				addCategory.validateMonths("Nov");
				addCategory.validateMonths("Dec");
				addCategory.setAsBlue();
				addCategory.setAsWhite();
				
				
				


			
			
			
			
			
			
			
			
			}
			



	}
	





