package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class MyOrdersPage {
	AndroidDriver driver;
	
	By pendingTab = By.xpath("//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.widget.TextView[@text='Pending']");
	By allOrdersTab = By.xpath("//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/"
			+ "android.widget.TextView[@text='All Orders']");
	
	By backArrow = By.xpath("//android.widget.ImageButton");
	By label = By.xpath("//android.view.View/android.widget.TextView");
	By notificationIcon = By.xpath("//android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout[@index='0']/"
			+ "android.widget.ImageView");
	By cartIcon = By.xpath("//android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout[@index='1']/"
			+ "android.widget.ImageView");
	By ellipseIcon = By.xpath("//android.widget.ImageView[@content-desc='More options']");
	
	// Constructor
	public MyOrdersPage(AndroidDriver driver){
		this.driver = driver;
	}
	
	// Check Pending and All Orders tabs are present under My orders page
	public void detailsPresent(){
		driver.findElement(pendingTab).isDisplayed();
		System.out.println("Pending tab is present");
		driver.findElement(allOrdersTab).isDisplayed();
		System.out.println("All Orders tab is present");
	
	
		// Headers present
		driver.findElement(backArrow).isDisplayed();
		System.out.println("Back arrow is present");
		String text = driver.findElement(label).getText();
		System.out.println("Label of the page is = " +text);
		driver.findElement(notificationIcon).isDisplayed();
		System.out.println("Notification icon is present");
		driver.findElement(cartIcon).isDisplayed();
		System.out.println("Cart icon is present");
		driver.findElement(ellipseIcon).isDisplayed();
		System.out.println("Ellipse icon is present");
	}
}
