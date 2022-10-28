package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageCart {
  private WebDriver driver;
	   Actions act;
	  public HomePageCart(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	  act=new Actions(driver);
  }
	  
	  @FindBy(xpath="//input[@id='search_query_top']")private WebElement searchBox;
	  public void serch() {
		  searchBox.sendKeys("Dresses");
		  System.out.println("Serch for dresses");
	  }
	  @FindBy(xpath="//button[@type='submit']")private WebElement searchButton;
	  public void clickSearch() {
		  searchButton.click();
		  System.out.println("search button clicked");
	  }
	  @FindBy(xpath="(//a[@title='Add to cart'])[1]")private WebElement addToCart;
	  public void clickAddToCart() {
		  addToCart.click();
		  System.out.println("Add to card button pressed");
	  }
	  @FindBy(xpath="//a[@title='Proceed to checkout']")private WebElement procToCheckA;
	  public void clickProcToCheckA() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  procToCheckA.click();
		  System.out.println("proceed to checkout - A");
		  
	  }
	  @FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")private WebElement proceed;
	  public void clickProcToCheckOutB() throws InterruptedException {
		  Thread.sleep(3000);
		 act.click( proceed).build().perform();
		  System.out.println("proceed to checkout - B");
	  }
	  //sign in to your account
	  @FindBy(xpath = "//input[@id='email']")private WebElement email;
	  public void sendUser() throws InterruptedException {
		  Thread.sleep(3000);
		  email.sendKeys("patilvinodp14@gmail.com");
	  }
	  @FindBy(xpath = "//input[@id='passwd']")private WebElement Pass;
	  public void sendPass() throws InterruptedException {
		  Thread.sleep(3000);
		  Pass.sendKeys("Vinod@123");
	  }
	  @FindBy(xpath = "//button[@id='SubmitLogin']")private WebElement subButton;
		public void clickSignInButtonA() throws InterruptedException {
			Thread.sleep(3000);
			subButton.click();
	  }
		@FindBy(xpath="//button[@name='processAddress']")private WebElement proc;
		  public void clickProcToCheckC() throws InterruptedException {
			  Thread.sleep(3000);
			  proc.click();
	 }
		  
		  @FindBy(xpath="//input[@name='cgv']")private WebElement clickCheckBx;
		  public void clickTermsAgree() throws InterruptedException {
			  Thread.sleep(3000);
			  clickCheckBx.click();
	 }
		  @FindBy(xpath="//button[@name='processCarrier']")private WebElement procd;
	      public void clickProcToCheckD() throws InterruptedException {
	    	  Thread.sleep(3000);
		  procd.click();
       }
		  @FindBy(xpath="//a[@title='Pay by bank wire']")private WebElement paymentmode;
		  public void clickPaymentMode() throws InterruptedException {
			  Thread.sleep(3000);
			  paymentmode.click();
	 }
		  @FindBy(xpath="//span[text()='I confirm my order']")private WebElement confOrder;
		  public void clickConfirmOrder() throws InterruptedException {
			  Thread.sleep(3000);
			 confOrder.click();
	 }
	  
}
