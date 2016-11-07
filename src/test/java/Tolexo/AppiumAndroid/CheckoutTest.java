package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;
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

	// NEFT flow and navigate to Thank You Page
	@Test(priority=0, enabled=false)
	public void NEFTFlow() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objProduct = objCategoryList.navigateToProduct();
		objCart = objProduct.navigateCart();
		objLogin = objCart.navigateLogin();
		objCheckout = objLogin.navigateToCheckout();
		objCheckout = objCart.tapProceedToPay();
		objThankYou = objCheckout.navigateOrderSucessNEFT();
		Assert.assertEquals("Order Success", objCheckout.getOrderSuccessText(), "Unable to find Order Success text on the page");
		objThankYou.navigateToHomePage();
		
	}
	
	// COD flow 
	@Test(priority=1, enabled=false)
	public void CODFlow() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objProduct = objCategoryList.navigateToProduct();
		objCart = objProduct.navigateCart();
		objLogin = objCart.navigateLogin();
		objCheckout = objLogin.navigateToCheckout();
		objCheckout = objCart.tapProceedToPay();
		objThankYou = objCheckout.navigateOTPSCreen();;
		Assert.assertEquals("Order Success", objCheckout.getOrderSuccessText(), "Unable to find Order Success text on the page");
		objThankYou.navigateToHomePage();
		
	}
		
}


