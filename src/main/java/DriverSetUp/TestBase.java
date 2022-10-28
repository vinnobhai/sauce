package DriverSetUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {
    public WebDriver driver;
	public  void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
	
	     driver=new ChromeDriver();
	     driver.get("http://automationpractice.com/index.php");
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
