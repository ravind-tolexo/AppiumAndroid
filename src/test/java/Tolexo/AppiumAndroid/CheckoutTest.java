package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class CheckoutTest extends Setup{
	AndroidDriver driver;
	HomePage objHome = new HomePage(driver);
	CheckoutPage objCheckout;
	CategoriesListPage objCategoryList;
	ProductPage objProduct;
	CartPage objCart;
	ThankYouPage objThankYou;
	LoginPage objLogin;
	
	
	
	@BeforeClass
	public void beforeclass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		objHome = new HomePage(driver);
		Thread.sleep(5000L);		
	}

	// Navigate to Thank You Page
	@Test(priority=0)
	public void thankYouPage() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objProduct = objCategoryList.navigateToProduct();
		objCart = objProduct.navigateCart();
		objLogin = objCart.navigateLogin();
		objCheckout = objLogin.navigateToCheckout();
		objCheckout.navigateOrderSucess();		
		
	}


}
