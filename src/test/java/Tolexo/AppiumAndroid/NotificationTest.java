package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import utils.Setup;

public class NotificationTest extends Setup{
	AndroidDriver driver;
	NotificationPage objNotify;
	HomePage objHome = new HomePage(driver);
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		objHome = new HomePage(driver);
		Thread.sleep(9000L);
	}
	
	
	
	
	//To navigate user to navigation page
	@Test(priority=0)
	public void navigateNotification(){
		objNotify.navigateNotificationPage();
	}
	

}
