package stepDefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.Set;

import io.cucumber.datatable.DataTable;
public class UsingDatatableStep {
	
	
	//WebDriver driver=null;
	@Given("user in the login PAGE")
	public void user_in_the_login_page() {
//	   driver=new ChromeDriver();
//	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	@When("user enter username and password")
	public void user_enter_username_and_password(DataTable dataTable) {
		List<Map<String, String>> table=dataTable.asMaps(String.class,String.class);
		
		String id=table.get(1).get("id");
		String userName=table.get(1).get("username");
		String passWord=table.get(1).get("password");
		System.out.println(id);
		System.out.println(userName);
		System.out.println(passWord);
	}
	@When("user press the login button")
	public void user_press_the_login_button() {
	    
	}
	@Then("user see the profile")
	public void user_see_the_profile() {
	   
	}




}
