package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class ThankYouPage {
	AndroidDriver driver;
	
	By continueShoppingButton = By.xpath("//android.widget.Button[@tex='Continue Shopping']");
	
	
	// Constuctor
	public ThankYouPage(AndroidDriver driver){
		this.driver = driver;
	}
	
	// Navigate to Home Page
	public void homePage(){
		driver.findElement(continueShoppingButton).click();
	}
}
