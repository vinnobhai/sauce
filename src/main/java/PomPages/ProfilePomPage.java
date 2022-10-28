package PomPages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePomPage {
	private WebDriver driver;
	Actions act;

	public ProfilePomPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		act = new Actions(driver);
	}
	
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement signInA;

	public void clickSignInA() {
		signInA.click();

	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement userA;

	public void sendUsernameA(String username) {
		userA.sendKeys(username);
	}

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement passA;

	public void sendPasswordA(String password) {
		passA.sendKeys(password);
	}

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement signInButtonA;

	public void clickSignInButtonA() {
		signInButtonA.click();
		}
	@FindBy(xpath = "//a[@title='Addresses']")
	private WebElement address;

	public void clickAddress() {
		address.click();
	}

	public void addDetails() {
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='last_item item box']/child::li"));
		Iterator itr = list.iterator();

		for(WebElement val:list) {
			System.out.println(val.getText());
		}
	}
}
