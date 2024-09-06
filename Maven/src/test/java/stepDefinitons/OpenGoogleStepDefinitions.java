package stepDefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleStepDefinitions {
	
	WebDriver driver=null;
	@Given("user enter the google")
	public void user_enter_the_google() {
	    // Write code here that turns the phrase above into concrete actions
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	}
	@When("user search the {string}")
	public void user_search_the(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("q")).sendKeys(string);
	}
	@When("user press the enter")
	public void user_press_the_enter() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	



}
