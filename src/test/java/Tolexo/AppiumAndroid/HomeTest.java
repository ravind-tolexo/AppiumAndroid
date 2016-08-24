package Tolexo.AppiumAndroid;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collections;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class HomeTest extends Setup{
	AndroidDriver driver;
	HomePage objHome;
	SearchPage objSearch;
	LoginPage objLogin;
	
	
	@BeforeClass
	public void beforeclass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		objHome = new HomePage(driver);
		Thread.sleep(5000L);		
	}
	
	//@AfterMethod
	public void getScreenShot(AndroidDriver driver, String outputlocation) throws IOException{
			System.out.println("Capturing the snapshot of the page ");
			File srcFiler=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFiler, new File(outputlocation));
			}
	
	// 	Sprint1 >> 
		// TC_03 >> To check hot deals present, clickable and page gets open successfully
		@Test(priority=10)
		public void hotDeals() throws InterruptedException{
			objHome.hotDeals();
			Thread.sleep(3000L);
			driver.findElement(By.xpath("//android.view.View/android.widget.ImageButton[@index='0']")).click();
			System.out.println("Hot Deals back arrow tapped");
		}
		
		// TC_04 >> To check CATEGORIES label present
		@Test(priority=1)
		public void categoriesLabel() throws InterruptedException{
			objHome.categoriesVisible();
			Thread.sleep(9000L);
			
		}
			
		// TC_05 >> To check all links displaying in navigation drawer 
		@Test(priority=2)
		public void allLinks() throws InterruptedException{
			objHome.categoriesNamesIcon();	
		}
		
		// TC_06 >> To check View All link present and after tapping on View All 27 categories with their icons are present
		@Test(priority=3)
		public void viewAllCategoriesList() throws InterruptedException{
			Thread.sleep(3000L);
			objHome.allCategoriesNamesPresent();
		}
		
			
		// TC_07 >> To check More link present and tapping on this link remaining options get displayed +
		// To check About Us link present and About Us page should get open successfully
		@Test(priority=4)
		public void moreLink() throws InterruptedException{
			objHome.moreLink();	
		}
		
		// TC_08 >> To check with keyword if search is working
		@Test(priority=5)
		public void searchWithKeyword() throws InterruptedException{
			objHome.backArrowAboutUs();
			objSearch = objHome.navigateSearchPage();
			Assert.assertEquals("No result found", objSearch.getSearchHeader(), "Unable to verify header");
			
			objSearch.searchResultPage();
			
			
		// TC_09 >> Swipe items horizontally
		@Test(priority=6)
		public void swipeItems(){
			driver.swipe(0, 731, 720, 1132, 60);
		}
		
		}
		
		
		
		// Navigate to My Account page
		@Test(priority=0)
		public void navigateMyAccount() throws InterruptedException{
			objLogin = objHome.navigateMyAccount();
			Thread.sleep(3000L);
			objLogin.memberLogin();
			
		}
					

		
		
		
	// TC_01 >> To check logo on the page
	//@Test(priority=1)
	public void logoPresent() throws InterruptedException {
		objHome.logoText();
	}

	// TC_02 >> To check header and attributes present
//	@Test(priority=2)
	public void headerPresent() throws IOException{
		objHome.toolBar();
		objHome.logoPresent();
		objHome.iconPresent();
		objHome.notificationIconPresent();
		objHome.cartIconPresent();
		objHome.ellipseIconPresent();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  	// Now you can do whatever you need to do with it, for example copy somewhere
	  	FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
		
	}
	
	// TC_03 >> To check search bar working
//	@Test(priority=3)
	public void searchWorking() throws InterruptedException{
		objHome.search();
	}
	
	//	TC_04 >> To check banners present and clickable
//	@Test(priority=4)
	public void bannersPresent(){
		objHome.bannersPresentClickable();
	}
	
	// TC_05 >> To check deals sections present and print them on console
//	@Test(priority=5)
	public void dealsAvailable(){
		objHome.dealsPresent();
		}
	
	// TC_06 >> To check View All links works for deals
	//@Test(priority=6)
	public void viewAllLinks(){
		objHome.viewAll();
	}
	
	// TC_07 >> Guest User >> To check option names display before login
	//@Test(priority=7)
	public void optionNamesDisplay(){
		objHome.ellipseOptionsNamesPresent();
		
	}
	
	// TC_08 >> To check avtar icon present
	//@Test(priority=8)
	public void avtarVisible(){
		objHome.avtarImagePresent();
	}
	
	// TC_09 >> To check Login or SignUp link text present
	//@Test(priority=9)
	public void checkLoginSignUpLink(){
		objHome.loginSignupPresent();
	}
	
	// TC_10 >> To check Hot Deals image present and clickable
	//@Test(priority=10)
	public void hotDealsPresent() throws InterruptedException{
		objHome.hotDeals();
	}
	
	// TC_11 >> To check CATEGORIES label present
	//@Test(priority=11)
	public void categoriesLabelPresent() throws InterruptedException{
		objHome.categoriesVisible();
	}
	
	// TC_12 >> To check 6 categories names are present with icons and arrow icon
	//@Test(priority=12)
	public void categoriesNames() throws InterruptedException{
		objHome.categoriesNamesIcon();
	}
	
	// TC_13 >> To check View All link present and after tapping on View All 27 categories with their icons are present
	//@Test(priority=13)
	public void viewAllCategoriesNames() throws InterruptedException{
		objHome.allCategoriesNamesPresent();
	}
	
	// TC_16 >> Navigate to category List page
	//@Test(priority=16)
	public void navigateCategoryListPage() throws InterruptedException{
		objHome.navigateToCategoryList();
	}
	
	
	
	
	@AfterClass
	public void quit(){
		driver.quit();
	}
}
