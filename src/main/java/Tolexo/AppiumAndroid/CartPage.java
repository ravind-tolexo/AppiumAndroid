package Tolexo.AppiumAndroid;

import io.appium.java_client.android.AndroidDriver;

public class CartPage {
	AndroidDriver driver;
	

	// Constructor
	public CartPage(AndroidDriver driver){
		this.driver = driver;
		System.out.println(driver);
	}
	
	// Navigate to Checkout page
	public void navigateCheckout(){
		
	}
}
