package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleHomePage {
	
	
	@Given("Launch Google")
	public void launch_google() {
	    System.out.println("step 1 -- launch google");
	}

	@When("Verify Google Page is Launched")
	public void verify_google_page_is_launched() {
	    System.out.println("step 2 -- verify google page");
	}

	@Then("Verify search box is present")
	public void verify_search_box_is_present() {
	    System.out.println("page 3 -- verify search box");
	}

}
