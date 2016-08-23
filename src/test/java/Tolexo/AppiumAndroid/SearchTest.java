package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;
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
	
	// Search working functionality
	//@Test(priority=0)
	public void searchFunctionality() throws InterruptedException{
		//objHome.navigateSearchPage();
		objSearch = objHome.navigateSearchPage();
		objSearch.searchResultPage();
		
	}
	
	// No result found on search page
	@Test(priority=0)
	public void noResultSearch() throws InterruptedException{
		objSearch = objHome.navigateSearchPage();
		objSearch.noResultPage();
		Assert.assertEquals("No result found", objSearch.getSearchHeader(), "Unable to verify header");
		
	}
}
