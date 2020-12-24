package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AmazonHooks {
	
	@Before(order = 1)
	public void setup() {
		System.out.println("amazon launch application");
	}
	
	@Before(order = 2)
	public void setup_url() {
		System.out.println("setup url");
	}
	
	@After(order = 1)
	public void teardown() {
		System.out.println("close down application");
	}
	
	@After(order = 2)
	public void close() {
		System.out.println("close all the browser");
	}
	
	@BeforeStep
	public void takeScreenShot() {
		System.out.println("take the screen shot");
	}
	
	@AfterStep
	public void refreshPage() {
		System.out.println("refresh the page");
	}

}
