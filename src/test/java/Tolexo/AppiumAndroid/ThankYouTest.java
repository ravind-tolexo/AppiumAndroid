package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;
import io.appium.java_client.android.AndroidDriver;

public class ThankYouTest extends Setup{
	AndroidDriver driver;
	HomePage objHome = new HomePage(driver);
	CheckoutPage objCheckout;
	CategoriesListPage objCategoryList;
	ProductPage objProduct;
	ThankYouPage objThankYou;
	CartPage objCart;
	LoginPage objLogin;
	
	@BeforeClass
	public void beforeclass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		objHome = new HomePage(driver);
		Thread.sleep(5000L);		
	}
	
	// Navigate to Home Page
	@Test(priority=0)
	public void navigateHome() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objProduct = objCategoryList.navigateToProduct();
		objCart = objProduct.navigateCart();
		objLogin = objCart.navigateLogin();
		objCheckout = objLogin.navigateToCheckout();
		objCheckout = objCart.tapProceedToPay();
		objThankYou = objCheckout.navigateOrderSucessNEFT();	
		objThankYou.navigateToHomePage();
		//objThankYou.navigateToHomePage();
		Assert.assertEquals("CONTINUE SHOPPING", objThankYou.getTextContinueButton(), "Unable to find matched text on the page");
		//return new HomePage(driver);
	}

}
