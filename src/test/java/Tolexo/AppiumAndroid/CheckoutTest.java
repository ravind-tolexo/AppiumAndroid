package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

public class CheckoutTest extends Setup{
	AndroidDriver driver;
	HomePage objHome = new HomePage(driver);
	CheckoutPage objCheckout;
	CategoriesListPage objCategoryList;
	ProductPage objProduct;
	
	
	
	@BeforeClass
	public void beforeclass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		objHome = new HomePage(driver);
		Thread.sleep(5000L);		
	}

	// Navigate to Thank You Page
	public void thankYouPage() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objCategoryList.navigateCategory();
		objProduct.navigateCart();		
		objCheckout.thankYou();
		
	}
}
