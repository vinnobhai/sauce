package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInPomPage {
	private WebDriver driver;
	Actions act;

	public SignInPomPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}

	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement signIn;

	public void clickSignIn() {
		act.click(signIn).build().perform();

	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement user;

	public void sendUsername(String username) {
		user.sendKeys(username);
	}

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement pass;

	public void sendPassword(String password) {
		pass.sendKeys(password);
	}

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement signInButton;

	public void clickSignInButton() {
		act.click(signInButton).build().perform();
		String expectedRes="My account - My Store";
		String actualRes=driver.getTitle();
	//	Assert.assertEquals(expectedRes, actualRes,"Successfully Login");
		
		}
  public void verifyProfilepage() {
	  if (driver.getCurrentUrl()
				.equalsIgnoreCase("http://automationpractice.com/index.php?controller=authentication")) {
			System.out.println("Invalid login Credentials");
		} else if (driver.getCurrentUrl()
				.equalsIgnoreCase("http://automationpractice.com/index.php?controller=my-account")) {
			System.out.println("You are SuccessFully SignIn Your Account");
		}

  }
}
