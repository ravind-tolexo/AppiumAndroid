package Tolexo.AppiumAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;

import utils.Setup;
import io.appium.java_client.android.AndroidDriver;

public class WishlistTest extends Setup{
	AndroidDriver driver;
	HomePage objHome;
	
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		Thread.sleep(5000L);
		objHome = new HomePage(driver);
	
	}
	
	
	// TC_05 >> To check items should get displayed under wishlist page
	public void optionsWishlistPresent(){
		
		
		
		// To check header should get present under Wishlist page and it should include back arrow,
		// label, search icon, cart icon and ellipse icon

	}

}
