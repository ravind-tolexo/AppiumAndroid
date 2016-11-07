package Tolexo.AppiumAndroid;

import junit.framework.Assert;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class ThankYouPage {
	AndroidDriver driver;
	
	By continueShoppingButton = By.xpath("//android.widget.Button[@text='Continue Shopping']");
	
	
	// Constuctor
	public ThankYouPage(AndroidDriver driver){
		this.driver = driver;
	}
	
	// Get text of Continue button
	public String getTextContinueButton(){
		String text = driver.findElement(continueShoppingButton).getText();
		return text;
	}
	
	// Navigate to Home Page
	public void navigateToHomePage() throws InterruptedException{
		driver.findElement(continueShoppingButton).click();
		System.out.println("Contnue Shopping button tapped");		
		Thread.sleep(3000L);
		System.out.println("Navigated to Home Page successfully");
		
	}
}
