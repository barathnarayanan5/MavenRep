package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POMFiles.AdminPOM;
import commonFunction.CommonFunction;

public class AdminVerfify extends CommonFunction{

	public void addUser() throws InterruptedException {
	
	
		AdminPOM.addButton.click();
		Thread.sleep(15000);
		AdminPOM.password.sendKeys("Priya123");
		AdminPOM.username.sendKeys("Priya");
		AdminPOM.confirmPassword.sendKeys("Priya123");
		AdminPOM.saveButton.click();
	}

	@Test
	public void userVerification() throws InterruptedException {
		
		PageFactory.initElements(driver, AdminPOM.class);
		AdminPOM.adminButton.click();
		//addUser();
		
		Thread.sleep(15000);
		for (WebElement user : AdminPOM.allUser) {
			if(user.getText().equalsIgnoreCase("Priya")) {
				assert(true);
				System.out.println("User is added "+user.getText());
				break;
			}
			
		}


	}
}
