package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverSetUp.TestBase;
import PomPages.ProfilePomPage;
import PomPages.SignInPomPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnationProfile {
	 WebDriver driver;
	TestBase ts;
	ProfilePomPage pp;
	
	@Given("load the browser and open the url")
	public void load_the_browser_and_open_the_url() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
	     driver=new ChromeDriver();
	     driver.get("http://automationpractice.com/index.php");
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    pp=new ProfilePomPage(driver);
			   pp.clickSignInA();
	}

	@When("enter the valid username and password")
	public void enter_the_valid_username_and_password() {
		
	   pp.sendUsernameA("patilvinodp14@gmail.com");
	   pp.sendPasswordA("Vinod@123");
	}

	@And("click on the SignIn button")
	public void click_on_the_sign_in_button() {
	  pp.clickSignInButtonA();
	}

	@Then("validate profile page")
	public void validate_profile_page() {
		pp.clickAddress();
		pp.addDetails();
	}

	@And("profile details which we entered")
	public void profile_details_which_we_entered() {
	    System.out.println("Details Validated Successfully");
	}
}
