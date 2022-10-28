package BankPomPage;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankCustomer {
	WebDriver driver;
	Actions act;

	public BankCustomer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}

	@FindBy(xpath = "//button[text()='Bank Manager Login']")
	private WebElement bankManlogi;

	public void bankLogin() throws InterruptedException {
			Thread.sleep(2000);
		act.click(bankManlogi).build().perform();
	}

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[1]")
	private WebElement addNewCust;

	public void addNewCustomer() throws InterruptedException {
		Thread.sleep(2000);
		act.click(addNewCust).build().perform();
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstName;

	public void enterfirst() throws InterruptedException {
		Thread.sleep(2000);
		firstName.sendKeys("Sachin");
	}

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastName;

	public void enterLast() throws InterruptedException {
		Thread.sleep(2000);
		lastName.sendKeys("Patil");
	}

	@FindBy(xpath = "//input[@placeholder='Post Code']")
	private WebElement pincode;

	public void enterPincode() throws InterruptedException {
		Thread.sleep(2000);
		pincode.sendKeys("425113");
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement addCustomer;

	public void clickAddCustomer() throws InterruptedException {
		Thread.sleep(3000);
		act.click(addCustomer).build().perform();
	}

	public void handleAlert() throws InterruptedException {
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println("Text present on alert is - " + alt.getText());
		alt.accept();
	}

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[2]")
	private WebElement CustomersList;

	public void clickCustomers() throws InterruptedException {
		Thread.sleep(3000);
		act.click(CustomersList).build().perform();
	}

//	@FindBy(xpath = "")
//	private WebElement clickSearch;

//	public void clickSearchCust() {
//		clickSearch.sendKeys("Sachin");
//	}

	public void removeCust() {
		java.util.List<WebElement> cust = driver.findElements(By.xpath("//table//tbody//tr"));

		for (int i = 1; i <= cust.size(); i++) {

		WebElement custName = driver
					.findElement(By.xpath("(//table//tbody//tr//td[1])[" + i + "]"));
		WebElement delete = driver.findElement(By.xpath("(//table//tbody//td[5])[" + i + "]"));

			if(custName.equals("Sachin")) {
               act.click(delete).build().perform();
               System.out.println("Account deleted Successfully");
			}
		}
	}

}
