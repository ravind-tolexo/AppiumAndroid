package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class NotificationPage {

	AndroidDriver driver;
	NotificationPage objNotify;
	
	By notificationIcon = By.xpath("android.support.v7.widget.LinearLayoutCompat[@index=2]/android.widget.FrameLayout/android.widget.ImageView");
	
	
	//Constructor
	public NotificationPage(AndroidDriver driver){
		this.driver = driver;
	}
	
	// Navigate to notification page
	public void navigateNotificationPage(){
		driver.findElement(notificationIcon).click();
		System.out.println("User navigated to Notification page after tapping on Notification icon");
		
	}
}
