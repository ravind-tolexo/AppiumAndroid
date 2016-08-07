package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class CheckoutPage {
	AndroidDriver driver;
	LoginPage objLogin;
	
	By proceedToPayButton = By.xpath("//android.widget.TextView[@text='Proceed to Pay']");
	
	
	// Constructor
	public CheckoutPage(){
		this.driver = driver;
	}

	
	// Navigate to Thankyou page
	public void thankYou() throws InterruptedException{
		driver.findElement(proceedToPayButton).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.view.View/android.widget.TextView[@text='Login']"))));
		objLogin.memberLogin();
	}
}
