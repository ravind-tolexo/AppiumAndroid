package Tolexo.AppiumAndroid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class WishlistPage {
	AndroidDriver driver;
	
	By itemsWishlist = By.xpath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout");
	
	// Constructor
	public WishlistPage(AndroidDriver driver){
		this.driver = driver;
	}
	

	// To check items should get displayed under wishlist page
	public void optionsWishlist(){
		// created empty list
		List<MobileElement> list = new ArrayList<MobileElement>();
		for(int i=0; i<=10; i++){
			List<MobileElement> list1 = driver.findElements(itemsWishlist);
			list.addAll(list1);
			
			
		}
		
		
		List<MobileElement> list1 = driver.findElements(itemsWishlist);
		int size = list1.size();
		System.out.println("Total number of items in wishlist present = " +size);
	}
}
