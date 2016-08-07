package Tolexo.AppiumAndroid;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProductPage {
	AndroidDriver driver;
	
	By size = By.xpath("//android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView");
	By buyButton = By.xpath("//android.widget.TextView[@text='BUY NOW']");
	
	// Constructor
	public ProductPage(){
		this.driver = driver;
	}
	
	
	// Navigate to cart page
	public CartPage navigateCart(){
		driver.scrollTo("Select Size");
		List<MobileElement> list = driver.findElements(size);
		list.get(0).click();
		driver.findElement(buyButton).click();
		return new CartPage(driver);
		
	}
}
