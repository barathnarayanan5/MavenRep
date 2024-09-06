package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POMFiles.LoginPOM;
import commonFunction.CommonFunction;

public class Login extends CommonFunction{
	@Test
	public void login() {
		PageFactory.initElements(driver, LoginPOM.class);
		String user=properties.getProperty("user");
		String password=properties.getProperty("password");
		LoginPOM.username.sendKeys(user);
		LoginPOM.password.sendKeys(password);
		LoginPOM.loginButton.click();
	}
}
