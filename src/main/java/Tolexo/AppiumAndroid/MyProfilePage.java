package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class MyProfilePage {
	AndroidDriver driver;
	
	By firstName = By.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[@index='0']/android.widget.EditText");
	By lastName = By.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/android.widget.EditText");
	By emailID = By.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[@index='2']/android.widget.EditText");
	By saveButton = By.xpath("//android.widget.Button[@text='Save']");
	
	By backArrow = By.xpath("//android.widget.ImageButton");
	By label = By.xpath("//android.widget.RelativeLayout/android.view.View/android.widget.TextView[@text='MY PROFILE']");
	By searchIcon = By.xpath("//android.support.v7.widget.LinearLayoutCompat/android.widget.TextView");
	By cartIcon = By.xpath("//android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ImageView");
	By ellipseIcon = By.xpath("//android.widget.ImageView[@content-desc='More options']");
	
	// Constructor
	public MyProfilePage(AndroidDriver driver){
		this.driver = driver;
	}
	
	
	// Details present under My Profile page like First Name, Last Name, Email Address and Save button
	public void detailsPresent(){
		driver.findElement(firstName).isDisplayed();
		System.out.println("First Name filed present");
		driver.findElement(lastName).isDisplayed();
		System.out.println("Last Name filed present");
		driver.findElement(emailID).isDisplayed();
		System.out.println("Email ID filed present");
		driver.findElement(saveButton).isDisplayed();
		System.out.println("Save button is present");
	
		// Header options present
		driver.findElement(backArrow).isDisplayed();
		System.out.println("Back Arrow present");
		String text = driver.findElement(label).getText();
		System.out.println("Label of the page is = " +text);
		driver.findElement(searchIcon).isDisplayed();
		System.out.println("Search icon is present");
		driver.findElement(cartIcon).isDisplayed();
		System.out.println("Carft icon is present");
		driver.findElement(ellipseIcon).isDisplayed();
		System.out.println("Ellipse icon is present");
	}
	
}
