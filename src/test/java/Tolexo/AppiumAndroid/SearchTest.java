package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SearchTest extends Setup{
	AndroidDriver driver;
	HomePage objHome = new HomePage(driver);
	SearchPage objSearch;
	
	
	@BeforeClass
	public void beforeclass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		objHome = new HomePage(driver);
		Thread.sleep(9000L);		
	}
	
	// Search functionality
	@Test(priority=0)
	public void searchFunctionality() throws InterruptedException{
		//objHome.navigateSearchPage();
		objSearch = objHome.navigateSearchPage();
		objSearch.searchResultPage();
		
	}
}
