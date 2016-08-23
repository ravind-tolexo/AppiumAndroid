package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;
import io.appium.java_client.android.AndroidDriver;

public class MyAccountTest extends Setup{
	AndroidDriver driver;
	HomePage objHome;
	MyAccountPage objMyAccount;
	LoginPage objLogin;
	
	
	@BeforeClass
	public void beforeclass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		objHome = new HomePage(driver);
		Thread.sleep(5000L);		
	}
	
	
	// Navigate to My Profile page
	@Test(priority=0)
	public void navigateMyProfilePage() throws InterruptedException{
		objLogin = objHome.navigateMyAccount();
		objMyAccount = objLogin.memberLogin();
		objMyAccount.navigateMyProfile();
		
		
	}
	
	// Navigate to Wishlist page
	@Test(priority=1)
	public void navigateWishlist(){
		
	}
}
