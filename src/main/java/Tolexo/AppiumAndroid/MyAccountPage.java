package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class MyAccountPage {
	AndroidDriver driver;
	HomePage objHome;
	
	By myProfile = By.xpath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout");
	
	By myOrders = By.xpath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout[@index='1']/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout");
	By wishlist = By.xpath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout[@index='2']/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout");
	
	
	// Constructor
	public MyAccountPage(AndroidDriver driver){
		this.driver = driver;
	}
	
	
	// Navigate to My Profile page
	public MyProfilePage navigateMyProfile(){
		driver.findElement(myProfile).click();
		System.out.println("My Profile option is tapped");
		return new MyProfilePage(driver);
		
	}
	
	// Navigate to My Orders Page
	public MyOrdersPage navigateMyOrders(){
		driver.findElement(myOrders).click();
		System.out.println("My Orders option is tapped");
		return new MyOrdersPage(driver);
	}
	
	// Navigate to Wishlist page
	public void navigateWishlist(){
		driver.findElement(wishlist).click();
		System.out.println("Wishlist option is tapped");
	}
}
