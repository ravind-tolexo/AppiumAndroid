package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;
import io.appium.java_client.android.AndroidDriver;

public class WishlistTest extends Setup{
	AndroidDriver driver;
	HomePage objHome;
	LoginPage objLogin;
	MyAccountPage objMyAccount;
	WishlistPage objWishlist;
	
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		Thread.sleep(5000L);
		objHome = new HomePage(driver);
	
	}
	
	
	// TC_05 >> To check items should get displayed under wishlist page
	@Test(priority=0)
	public void optionsWishlistPresent() throws InterruptedException{
		objLogin = objHome.navigateMyAccount();
		objMyAccount = objLogin.memberLogin();
		objWishlist = objMyAccount.navigateWishlist();
		objWishlist.optionsWishlist();
		
		
		// To check header should get present under Wishlist page and it should include back arrow,
		// label, search icon, cart icon and ellipse icon

	}

}
