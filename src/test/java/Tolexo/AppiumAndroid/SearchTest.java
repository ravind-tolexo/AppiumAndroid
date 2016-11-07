package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;
import io.appium.java_client.android.AndroidDriver;

public class SearchTest extends Setup {
	AndroidDriver driver;
	HomePage objHome = new HomePage(driver);
	SearchPage objSearch;

	@BeforeClass
	public void beforeclass() throws MalformedURLException,
			InterruptedException {

		prepareAndroidForAppium();
		this.driver = getDriver();
		objHome = new HomePage(driver);
		Thread.sleep(9000L);
	}

	// No result found on search page
	@Test(priority=0)
	public void noResultSearch() throws InterruptedException {
		objSearch = objHome.navigateSearchPage();
		objSearch.noResultPage();
		Thread.sleep(3000L);
		objSearch.getSearchHeader();
		Assert.assertEquals("No result found", objSearch.getSearchHeader());
		System.out.println("Navigated to No Result Found page");

	}

	// Searching via proper keywords
	//@Test(priority = 0)
	public void searchFunctionality() throws InterruptedException {
		objSearch = objHome.navigateSearchPage();
		objSearch.searchResultPage();

	}
}
