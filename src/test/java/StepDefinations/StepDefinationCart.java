package StepDefinations;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PomPages.HomePageCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationCart 
{   
	WebDriver driver;
    HomePageCart hc;
    Random random;
   @Given("load the browser and open the url site")
    public void load_the_browser_and_open_the_url_site() {
	   System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
	     driver=new ChromeDriver();
	     driver.get("http://automationpractice.com/index.php");
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   }
	@When("search for product")
	public void search_for_product() {
	    hc=new HomePageCart(driver);
	    hc.serch();
	    hc.clickSearch();
	}

	@And("add the product to cart and Proceed to checkout")
	public void add_the_product_to_cart_and_proceed_to_checkout() throws InterruptedException {
	   hc.clickAddToCart();
	   hc.clickProcToCheckA();
	   hc.clickProcToCheckOutB();
	}

	@Then("sign in the acccount and  Proceed to checkout")
	public void sign_in_the_acccount_and_proceed_to_checkout() throws InterruptedException {
	    hc.sendUser();
	    hc.sendPass();
	    hc.clickSignInButtonA();
	    hc.clickProcToCheckC();
	}

	@When("terms of service accept it and Proceed to checkout")
	public void terms_of_service_accept_it_and_proceed_to_checkout() throws InterruptedException {
	   hc.clickTermsAgree();
	   hc.clickProcToCheckD();
	   
	}

	@Then("select the payment mode and do confirm order")
	public void select_the_payment_mode_and_do_confirm_order() throws InterruptedException {
	  hc.clickPaymentMode();
	  hc.clickConfirmOrder();
	 
	}

	@And("validate order confirmation")
	public void validate_order_confirmation() {
		random=new Random();
		System.out.println("Your Order Id is = "+random.nextLong());
	  
		String confMsg=driver.getPageSource();
	    
	    
	    if(driver.getTitle().equalsIgnoreCase("Order confirmation - My Store")) {
			System.out.println("Your order is confirmed");
			
		 }
	}
}
