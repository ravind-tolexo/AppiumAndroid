package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

public class SearchPage {

	AndroidDriver driver;
	
	
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
		System.out.println("Navigated to Search result page");
	}
	
}
