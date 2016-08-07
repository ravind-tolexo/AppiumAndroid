package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class CartTest extends Setup{
	AndroidDriver driver;
	HomePage objHome = new HomePage(driver);
	CategoriesListPage objCategoryList;
	CartPage objCart;
	ProductPage objProduct;
	
	
	@BeforeClass
	public void beforeclass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		objHome = new HomePage(driver);
		Thread.sleep(5000L);		
	}
	
	// Navigate to Checkout page
	@Test(priority=0)
	public CheckoutPage navigateCheckoutPage() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objCategoryList.navigateCategory();
		objProduct.navigateCart();
		objCart.navigateCheckout();
		return new CheckoutPage(driver);
		
		
		
	}

}
