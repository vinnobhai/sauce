package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BankPomPage.BankCustomer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationBankCust {
	WebDriver driver;
	BankCustomer bc;

	@Given("load brow and hit url")
	public void load_brow_and_hit_url() {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("click bank manager login")
	public void click_bank_manager_login() throws InterruptedException {
		bc = new BankCustomer(driver);
		bc.bankLogin();
	}

	@And("click add new customer")
	public void click_add_new_customer() throws InterruptedException {
		bc.addNewCustomer();
	}

	@When("enter customer details and click add")
	public void enter_customer_details_and_click_add() throws InterruptedException {
		bc.enterfirst();
		bc.enterLast();
		bc.enterPincode();
		bc.clickAddCustomer();
		bc.handleAlert();

	}

	@And("click on customers")
	public void click_on_customers() throws InterruptedException {
		bc.clickCustomers();
		System.out.println("clicked on customer");
	}

	@Then("validate the customer added or not")
	public void validate_the_customer_added_or_not() {
		if (driver.getPageSource()=="Sachin") {
			System.out.println("Custemer get added successfully");
		}
	}

	@When("click on the delete button")
	public void click_on_the_delete_button() {
		bc.removeCust();
	}

	@Then("check for the customer is removed or not")
	public void check_for_the_customer_is_removed_or_not() {
		if (driver.getPageSource()!="Sachin") {
			System.out.println("Custemer get removed successfully");
		}
	}

}
