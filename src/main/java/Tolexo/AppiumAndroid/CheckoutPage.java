package Tolexo.AppiumAndroid;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class CheckoutPage {
	AndroidDriver driver;
	LoginPage objLogin;
	CartPage objCart;
	
	By neft = By.xpath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='3']/"
			+ "android.widget.LinearLayout/android.widget.RadioButton[@index='1']");
	
	By placeOrder = By.xpath("//android.widget.LinearLayout[@index='2']/android.widget.TextView[@text='Place Order']");
	By orderSucess = By.xpath("//android.view.View/android.widget.TextView[@text='Order Success']");
	
	
	// Constructor
	public CheckoutPage(AndroidDriver driver){
		this.driver = driver;
	}
	
	
	
	// Navigate to Order Success page via NEFT
	public ThankYouPage navigateOrderSucessNEFT() throws InterruptedException{
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.view.View/android.widget.TextView[@text='Login']"))));
//		objLogin.memberLogin();
//		objCart.navigateCheckout();
//		WebDriverWait wait1 = new WebDriverWait(driver,30);
//		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout"
//				+ "/android.widget.LinearLayout+/android.widget.LinearLayout[@index=1]"
//				+ "/android.widget.TextView[@text='Prepaid and Cash On Delivery are available at your pincode.']"))));
		driver.scrollTo("PAY OFFLINE USING NEFT / RTGS / IMPS ");
		driver.findElement(neft).click();
		System.out.println("NEFT option selected");
		driver.findElement(placeOrder).click();
		System.out.println("Place Order button tapped");
		Thread.sleep(12000L);
		//WebDriverWait wait2 = new WebDriverWait(driver,30);
//		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(orderSucess)));
		return new ThankYouPage(driver);
		
	}
	
	// Navigate to OTP screen via COD
	public void navigateOTPSCreen(){
		driver.scrollTo("PAY OFFLINE USING NEFT / RTGS / IMPS ");
		
	}
	
	// Get Order Success text from the page
	public String getOrderSuccessText(){
		String text = driver.findElement(orderSucess).getText();
		return text;
	}
}
