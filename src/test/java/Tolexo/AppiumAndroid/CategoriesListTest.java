package Tolexo.AppiumAndroid;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;

public class CategoriesListTest extends Setup{
	AndroidDriver driver;
	HomePage objHome;
	CategoriesListPage objCategoryList;
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException, InterruptedException{
	
		prepareAndroidForAppium();
		this.driver = getDriver();
		Thread.sleep(5000L);
		objHome = new HomePage(driver);
	
	}
	
	// TC_01 >> To check header and attributes present
	//@Test(priority=0)
	public void headerPresent() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objCategoryList.headerVisible();
	}
	
	// TC_02 >> To check Sort and Filters button present and working
	//@Test(priority=1)
	public void sortFilterPresent() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objCategoryList.sortFilterVisible();
	}
	
	// TC_03 >> Navigate to Product Page
	@Test(priority=2)
	public void navigateToProduct() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		Thread.sleep(3000L);
		objCategoryList.navigateToProduct();
		
	}
}
