package Tolexo.AppiumAndroid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CategoriesListPage {	
	AndroidDriver<MobileElement> driver;
	
	String app_package_name = "com.tolexo.android/";
	HomePage objHome = new HomePage(driver);
	
	By headerPresent = By.xpath("//android.view.View/android.widget.ImageButton/android.widget.Spinner[@index='1']/"
			+ "android.support.v7.widget.LinearLayoutCompat[@index='2']");
	By sortFilter = By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']/"
			+ "android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='1']/android.widget.ImageView[@index='0']/"
			+ "android.widget.ImageView[@index='2']");
	By categoryOption = By.xpath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout");
			
	
	// Constructor
	public CategoriesListPage(AndroidDriver driver) {
		this.driver = driver;
	}

	// Header present 
	public void headerVisible(){
		List<MobileElement> list = driver.findElements(headerPresent);
		System.out.println("Headers Attributes present = " +list.size());
		for(MobileElement asd : list){
		
			System.out.println("Header Attributes names = " +asd.getText());
		}
	}

	// Sort and Filter options present
	public void sortFilterVisible(){
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(sortFilter)));
		String qa = driver.findElement(sortFilter).getText();
		System.out.println("Sort and Filter oprions are present = " +qa);
	}
	
	// Navigate to Product page
	public ProductPage navigateToProduct(){
		List<MobileElement> list = driver.findElements(categoryOption);
		list.get(0).click();
		System.out.println("Navigated to Product page");
		return new ProductPage(driver);
		
	}
}
