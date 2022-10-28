package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverSetUp.TestBase;
import PomPages.SignInPomPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationSignin {
  WebDriver driver;
  TestBase tb;
  SignInPomPage sp;
	@Given("Load the browser and open the url")
	public void load_the_browser_and_open_the_url() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
	     driver=new ChromeDriver();
	     driver.get("http://automationpractice.com/index.php");
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@When("Enter username {string} and password {string}")
	public void enter_username_and_password(String string, String string2) {
	   sp=new SignInPomPage(driver);
	   sp.clickSignIn();
	   sp.sendUsername(string);
	   sp.sendPassword(string2);
	}

	@And("click the SignIn button")
	public void click_the_sign_in_button() {
	   sp.clickSignInButton();
	}

	@Then("open the profile page")
	public void open_the_profile_page() {
	   sp.verifyProfilepage();
	}
}
