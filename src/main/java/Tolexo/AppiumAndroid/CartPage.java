package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class CartPage {
	AndroidDriver driver;
	
	By proceedToPay = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.TextView[@text='Proceed to Pay' and index='1']");
	

	// Constructor
	public CartPage(AndroidDriver driver){
		this.driver = driver;
		
	}
	
	// Navigate to Checkout page
	public CheckoutPage navigateCheckout() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(proceedToPay)));
		Thread.sleep(3000L);
		driver.scrollTo("Proceed to Pay");
		driver.findElement(proceedToPay).click();
		return new CheckoutPage(driver);
	}
}
