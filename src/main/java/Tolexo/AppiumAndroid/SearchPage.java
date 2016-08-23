package Tolexo.AppiumAndroid;

import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileElement;
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
	
	// get text of the page >> No Result Found
	public String getSearchHeader() {
		WebElement text = driver.findElement(By.xpath("//android.widget.FrameLayout[@index='2']/android.widget.LinearLayout/"
				+ "android.widget.TextView[@text='No result found' and index='0']"));
		String text1= text.getText();
		return text1;
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
		// Total count of items got searched
		List<MobileElement> list = driver.findElements(By.xpath("//android.support.v7.widget.RecyclerView/"
				+ "android.widget.LinearLayout"));
		System.out.println("Total count of items got searched are = " +list.size());
	}
	
	// Tap on back arrow from search page
	public HomePage navigateToHome() {
		
		return new HomePage(driver);
	}
	
	// Navigate to No Result Found page
	public void noResultPage() throws InterruptedException{
		Thread.sleep(3000L);
		driver.findElement(realSearchTextBox).sendKeys("kjasdhjkda");
		Thread.sleep(3000L);
		driver.sendKeyEvent(66);
		System.out.println("Navigated to No Result Found page");
	}
	
	// 
	
}
