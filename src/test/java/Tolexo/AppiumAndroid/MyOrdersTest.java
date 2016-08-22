package Tolexo.AppiumAndroid;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;

public class MyOrdersTest extends Setup{
	AndroidDriver driver;
	HomePage objHome;
	LoginPage objLogin;
	MyAccountPage objMyAccount;
	MyOrdersPage objMyOrders;
	
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		Thread.sleep(5000L);
		objHome = new HomePage(driver);
	
	}
	
	// TC_03 >> To check Pending and All Orders tabs are present under My orders page
	@Test(priority=0)
	public void optionsMyOrdersPresent() throws InterruptedException{
		objLogin = objHome.navigateMyAccount();
		objMyAccount = objLogin.memberLogin();
		objMyOrders= objMyAccount.navigateMyOrders();
	
	// TC_04 >> To check header should get present under My Orders page and it should include back arrow, label, 
	// notification icon, cart icon and ellipse icon
		
		objMyOrders.detailsPresent();
		
	}
	
}
