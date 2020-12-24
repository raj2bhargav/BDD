package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailHomePage {
	
	@Given("Launch Gmail Hone Page")
	public void launch_gmail_hone_page() {
	    System.out.println("Launch Gmail Home Page");
	}

	@When("Verify user id and password")
	public void verify_user_id_and_password() {
	    System.out.println("Verify User Id and Password");
	}

	@Then("Enter user id and password")
	public void enter_user_id_and_password() {
	   System.out.println("Enter User Id and Password");
	}

	@Then("Click on the Login button")
	public void click_on_the_login_button() {
	    System.out.println("Click on the Login button");
	}

}
