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
	
	// TC_01 >> Navigate to Checkout page
	@Test(priority=0)
	public void navigateCheckoutPage() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objProduct = objCategoryList.navigateToProduct();
		Thread.sleep(3000L);
		objCart = objProduct.navigateCart();
		objCart.navigateCheckout();
	
	}

}
