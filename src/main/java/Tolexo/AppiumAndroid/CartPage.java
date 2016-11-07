package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class CartPage {
	AndroidDriver driver;
	
	By proceedToPay = By.xpath("//android.widget.TextView[@text='Proceed to Pay']");
	

	// Constructor
	public CartPage(AndroidDriver driver){
		this.driver = driver;
		
	}
	
	// Navigate to Login page
	public LoginPage navigateLogin() throws InterruptedException{
//		WebDriverWait wait = new WebDriverWait(driver,90);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(proceedToPay)));
		Thread.sleep(6000L);
		
		//driver.scrollTo("TOTAL PAYABLE");
//		TouchAction a2 = new TouchAction(driver);
//		//a2.longPress(0, 720);
//		a2.press(0, 720);
//		//a2.tap (680, 1041).perform();
		
//		System.out.println("gotcha!!");
		driver.scrollTo("Tax");
		//driver.findElement(By.xpath("//android.widget.FrameLayout[@index='2']/android.widget.TextView[@index='1']"));
		
		driver.findElement(proceedToPay).click();
		System.out.println("Proceed To Pay button tapped");
		Thread.sleep(6000L);
		return new LoginPage(driver);
	}
	
	// Tap on Proceed to Pay button
	public CheckoutPage tapProceedToPay() throws InterruptedException{
		driver.findElement(proceedToPay).click();
		System.out.println("Proceed To Pay button tapped");
		Thread.sleep(6000L);
		return new CheckoutPage(driver);
	}
}
