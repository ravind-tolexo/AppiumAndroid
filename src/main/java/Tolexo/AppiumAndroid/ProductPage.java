package Tolexo.AppiumAndroid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProductPage {
	AndroidDriver driver;
	
	By size = By.xpath("//android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView");
	By buyButton = By.xpath("//android.widget.TextView[@text='BUY NOW']");
	
	// Constructor
	public ProductPage(AndroidDriver driver){
		this.driver = driver;
	}
	
	
	// Navigate to cart page
	public CartPage navigateCart() throws InterruptedException{
		//driver.scrollTo("Select Size");
		driver.scrollTo("Quantity");
//		List<MobileElement> list = driver.findElements(size);
//		list.get(0).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(buyButton)));
		System.out.println("Buy Now button is visible and tapped");
		driver.findElement(buyButton).click();
		Thread.sleep(3000L);
		return new CartPage(driver);
		
	}
}
