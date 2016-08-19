package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class SearchPage {

	AndroidDriver driver;
	SearchPage objSearch;
	
	
	By realSearchTextBox = By.xpath("//android.widget.FrameLayout/android.view.View/android.widget.LinearLayout/"
			+ "android.view.View/android.support.v7.widget.LinearLayoutCompat/android.support.v7.widget.LinearLayoutCompat/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.widget.EditText[@text='Search for products, brands, categories etc.']");
	
	// Constructor
	public SearchPage(AndroidDriver driver){
		this.driver = driver;
	}
	
		
	// Navigate to Search result page
	public void searchResultPage() throws InterruptedException{
		Thread.sleep(3000L);
		driver.findElement(realSearchTextBox).sendKeys("shoes");
		Thread.sleep(3000L);
		driver.sendKeyEvent(66);
		//driver.sendKeyEvent(AndroidKeyCode.KEYCODE_SEARCH);
	//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER );
		Thread.sleep(3000L);
		System.out.println("Navigated to Search result page");
		String text = driver
				.findElement(
						By.xpath("//android.support.v4.widget.DrawerLayout/android.view.View/"
								+ "android.widget.LinearLayout/android.view.View/android.widget.TextView[@text='shoes']"))
				.getText();
		System.out.println("Title of the page on the search result page is = "
				+ text);
	}
	
	// Tap on back arrow from search page
	public HomePage navigateToHome() {
		
		return new HomePage(driver);
	}
	
}
