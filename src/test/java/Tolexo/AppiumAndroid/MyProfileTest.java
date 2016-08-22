package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;

public class MyProfileTest extends Setup{
	AndroidDriver driver;
	MyProfilePage objMyProfile;
	HomePage objHome;
	LoginPage objLogin;
	MyAccountPage objMyAccount;
	
	

	@BeforeClass
	public void beforeClass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		Thread.sleep(5000L);
		objHome = new HomePage(driver);
	
	}
	
	
	
	// TC_01 >> To check all details present under My Profile page like First Name, Last Name, Email Address and Save button
	// TC_02 >> To check header should get present under My Profile page and it should include back arrow, label, search icon, cart icon and ellipse icon
	@Test(priority=0)
	public void optionsMyProfile() throws InterruptedException{
		objLogin = objHome.navigateMyAccount();
		objMyAccount = objLogin.memberLogin();
		objMyProfile = objMyAccount.navigateMyProfile();
		objMyProfile.detailsPresent();
		Thread.sleep(3000L);
	}
	
		
}
