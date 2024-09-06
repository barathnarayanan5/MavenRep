package POMFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM {
	@FindBy(xpath = "//input[@name='username']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;
	
	@FindBy( xpath = "//button")
	public static WebElement loginButton;
}
