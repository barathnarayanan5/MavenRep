package POMFiles;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class AdminPOM {
	
	@FindBy(linkText = "Admin")
	public static WebElement adminButton;
	
	@FindBy(linkText = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")
	public static WebElement userRole;
	
	@FindBy(xpath="//button[text()=' Add ']")
	public static WebElement addButton;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	public static WebElement password;
	

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	public static WebElement username;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	public static WebElement confirmPassword;
	
	@FindBy(xpath="//button[text()=' Save ']")
	public static WebElement saveButton;
	
	@FindBy(xpath="//div[@class='oxd-table-card']//child::div[2]")
	public static List<WebElement> allUser;
	
}
