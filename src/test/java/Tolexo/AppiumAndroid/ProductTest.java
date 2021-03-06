package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;

public class ProductTest extends Setup{
	AndroidDriver driver;
	HomePage objHome;
	CategoriesListPage objCategoryList;
	ProductPage objProduct;
	CartPage objCart;
	
	
	@BeforeClass
	public void beforeclass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		objHome = new HomePage(driver);
		Thread.sleep(5000L);		
	}
	
	
	// TC_01 >> Navigate to cart page
	@Test(priority=0)
	public void navigateToCart() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objProduct = objCategoryList.navigateToProduct();
		objProduct.navigateCart();
		
	}
}
