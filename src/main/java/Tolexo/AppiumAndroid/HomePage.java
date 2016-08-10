package Tolexo.AppiumAndroid;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.swing.Scrollable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.thoughtworks.selenium.webdriven.commands.GetTable;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ScrollsTo;
//import utils.MobileElement;
//import org.openqa.selenium.WebDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomePage {
	AndroidDriver<MobileElement> driver;

	String app_package_name = "com.tolexo.android/";
	By ellipseMenuIcon = By.xpath("//android.widget.LinearLayout/android.view.View/android.support.v7.widget.LinearLayoutCompat/"
			+ "android.widget.ImageView[@index='2']");
	By loginLink = By.xpath("//android.widget.FrameLayout/android.widget.ListView/"
			+ "/android.widget.LinearLayout/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@text='Login / Signup']");
	
	By banner = By.xpath("//android.view.View[@index='0']");
	
	By logo = By.xpath("//android.widget.TextView[@text='Tolexo']");
	By toolbar = By.id("com.tolexo.android:id/toolbar");
	By hamburgerIcon = By.xpath("//android.widget.FrameLayout/android.view.View/android.support.v4.widget.DrawerLayout/"
			+ "android.widget.LinearLayout/"
			+ "android.widget.LinearLayout/android.view.View/android.widget.ImageButton[@index='0']");
	By notificationIcon = By.id("com.tolexo.android:id/iv_notification");
	By cartIcon = By.xpath("//android.widget.ImageView[@index='0']");
	By searchBar = By.id("com.tolexo.android:id/et_search_view");
	By searchBarInternal = By.id("com.tolexo.android:id/search_src_text");
	By searchSearchIcon = By.id("com.tolexo.android:id/action_search");
	By deals = By.id("com.tolexo.android:id/textViewHomeLeft");
	By viewAll = By.xpath("//android.widget.TextView[@text='View All']");
	By avtar = By.className("android.widget.ImageView");
	By loginSignup = By.xpath("//android.widget.TextView[@text='Login or Signup']");
	By hotDeals = By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.ImageView[@index='0']");
	By hotDealsInner = By.xpath("//android.view.View/android.widget.TextView[@text='Hot Deals']");
	By categories = By.xpath("//android.widget.TextView[@text='C A T E G O R I E S']");
	By categoriesNames = By.xpath("//android.view.View/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
	By viewAllLink = By.xpath("//android.widget.LinearLayout[@index='9']/android.widget.LinearLayout/android.widget.TextView[@text='View All']");
	By moreLink = By.xpath("//android.widget.LinearLayout[@index='10']");
	By backLinkAllCategories = By.xpath("//android.view.View/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.widget.ImageView");
	By moreOptions = By.xpath("//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
	

	// Constructor
	public HomePage(AndroidDriver driver) {
		this.driver = driver;
	}
	
	// Tapping on More link and display all options
	public void moreLink() throws InterruptedException{
		driver.findElement(backLinkAllCategories).click();
		System.out.println("All CATEGORIES back arrow link tapped");
		Thread.sleep(6000L);
		
		driver.findElement(moreLink).click();
		System.out.println("More Link tapped");
		Thread.sleep(3000L);
		List<MobileElement> list = driver.findElements(moreOptions);
		System.out.println("Count under more link = " +list.get(0));
		for(MobileElement asaq : list){
			System.out.println(list);
		}
//		Collections.reverse(list);
		
		
	}

	// Navigate to login page
	public LoginPage navigateToLoginPage(){
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ellipseMenuIcon)));
		driver.findElement(ellipseMenuIcon).click();
		WebDriverWait wait1 = new WebDriverWait(driver,240);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(loginLink)));
		driver.findElement(loginLink).click();
		return new LoginPage(driver);
		
	}
	
	// tap on ellipse icon
	public HomePage tapOnEllipseIcon() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ellipseMenuIcon)));
		driver.findElement(ellipseMenuIcon).click();
		return new HomePage(driver);
	}
	
	// tap on login link
	public HomePage tapOnLoginLink(){
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(loginLink)));
		driver.findElement(loginLink).click();
		return new HomePage(driver);
	}
	
	
		
	// logo text
	public void logoText() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(logo)));
		String logoText = driver.findElement(logo).getText();
		System.out.println("Logo is present with name: " + logoText);
	}

	// Toolbar is present or not
	public void toolBar(){
		Boolean toolbarPresent = driver.findElement(toolbar).isDisplayed();
		System.out.println("Toolbar is present: " +toolbarPresent);
	}
		
	// Tolexo logo is present or not
	public void logoPresent(){
		Boolean logoPresent = driver.findElement(logo).isDisplayed();
		System.out.println("Tolexo logo is present: " +logoPresent);
	}
		
	// hamburgerIcon icon attribute is present or not
	public void iconPresent(){
		Boolean hamburgerIconPresent = driver.findElement(hamburgerIcon).isDisplayed();
		System.out.println("hamburgerIconIcon is present: " +hamburgerIconPresent);
	}
		
	// Notification icon is present or not
	public void notificationIconPresent(){
		Boolean notificationIconPresent = driver.findElement(notificationIcon).isDisplayed();
		System.out.println("Notification Icon is present: " +notificationIconPresent);
	}
		
	// Cart icon is present or not
	public void cartIconPresent(){
		Boolean cartIconPresent = driver.findElement(cartIcon).isDisplayed();
		System.out.println("Cart icon is present: " +cartIconPresent);
	}
		
	// Ellipse icon is present or not
	public void ellipseIconPresent(){
		Boolean ellipseMenuIconPresent = driver.findElement(ellipseMenuIcon).isDisplayed();
		System.out.println("Ellipse Menu Icon is present: " +ellipseMenuIconPresent);
	}
	
	// Search 
	public void search() throws InterruptedException{
		
		driver.findElement(searchBar).click();
		Thread.sleep(3000L);
		driver.findElement(searchBarInternal).sendKeys("shoes" + "\n");
		driver.hideKeyboard();
		String searchName01 = driver.findElement(By.xpath("//android.widget.TextView[@text='shoes']")).getText();
		System.out.println("Searched keyword name is: " +searchName01);
		
	
//		try{
//			if (searchName01.equals("shoes")){
//				File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				FileUtils.copyFile(screenShotFile, new File("path goes here" + "appImage" + ".png"));
//			}
//		}
//		catch(Exception e){
//			
//		}
		Thread.sleep(2000L);
		driver.findElement(searchSearchIcon).click();
		Thread.sleep(2000L);
		driver.findElement(searchBarInternal).sendKeys("nuts" + "\n");
		driver.hideKeyboard();
		String searchName02 = driver.findElement(By.xpath("//android.widget.TextView[@text='nuts']")).getText();
		System.out.println("Searched keyword name is: " +searchName02);
		
		
		
	}
	
	 // Banners Present and clickable
	 public void bannersPresentClickable(){
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(banner)));		 
		 List<MobileElement> list = driver.findElements(banner);
		 System.out.println("Total number of banners are = " +list.size());
		 for(MobileElement abc : list)
		 {
			 System.out.println(abc.getText());
		 }
		 list.get(0).click();
		 System.out.println("Banner is successfully clicked");
		}
	 
	 // Deals present
	 public void dealsPresent(){
//		 WebDriverWait wait = new WebDriverWait(driver,30);
//		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("android.widget.TextView[@text='Best Sellers']"))));
		 driver.scrollTo("LED LIGHTING");
		 List<MobileElement> list1 = driver.findElements(deals);
		 System.out.println("Total number of deals are = " +list1.size());
		 for(MobileElement cde : list1){
			 System.out.println(cde.getText());
		 }
		 
		 driver.scrollTo("POWER TOOLS");
		 List<MobileElement> list2 = driver.findElements(deals);
		 System.out.println("Total number of deals are = " +list2.size());
		 for(MobileElement cde : list2){
			 System.out.println(cde.getText());
		 }
		 
		 driver.scrollTo("BEST SELLERS");
		 List<MobileElement> list3 = driver.findElements(deals);
		 System.out.println("Total number of deals are = " +list3.size());
		 for(MobileElement cde : list3){
			 System.out.println(cde.getText());
		 }
		 
		}
	 
	 
	 
	// View All links present
	public void viewAll(){
		driver.scrollTo("BEST SELLERS");
		List<MobileElement> list = driver.findElements(viewAll);
		System.out.println("Total number of View All links are =" +list.size());
		
		for(MobileElement asd : list){
			System.out.println(asd.getText());
		}
		
	}
	
	// Ellipse menu options names and size
	public void ellipseOptionsNamesPresent(){
		driver.findElement(ellipseMenuIcon).click();
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("android.widget.LinearLayout"))));
		List<MobileElement> list = driver.findElements(By.className("android.widget.TextView"));
		System.out.println("Total number of options available = " +list.size());
		for(MobileElement fgd : list){
			System.out.println("Options names are = " +fgd.getText());
		}
	}
	
	// Avtar image present
	public void avtarImagePresent(){
		driver.findElement(hamburgerIcon).click();
		String avtarText = driver.findElement(avtar).getText();
		System.out.println(avtarText);
	}
	
	// Login or Signup present
	public void loginSignupPresent(){
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(hamburgerIcon)));
		driver.findElement(hamburgerIcon).click();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(loginSignup)));
		String text = driver.findElement(loginSignup).getText();
		System.out.println("Login or Signup text is present = " +text);
	}
	
	// Hot Deals present and clickable
	public void hotDeals() throws InterruptedException{
		Thread.sleep(3000L);
		driver.findElement(hamburgerIcon).click();
		WebDriverWait wait = new WebDriverWait(driver,1200);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(hotDeals)));
		driver.findElement(hotDeals).click();
		Thread.sleep(6000L);
		String text = driver.findElement(hotDealsInner).getText();
		System.out.println("Title of the page = " +text);
	}
	
	// CATEGORIES text present
	public void categoriesVisible() throws InterruptedException{
		Thread.sleep(3000L);
		driver.findElement(hamburgerIcon).click();
		WebDriverWait wait = new WebDriverWait(driver,90);		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(categories)));
		String text = driver.findElement(categories).getText();
		System.out.println("Label displaying = " +text);
	}
	
	// Categories names and attributes present
	public void categoriesNamesIcon() throws InterruptedException{
		Thread.sleep(6000L);
		driver.findElement(hamburgerIcon).click();
		System.out.println("Hamburger Icon clicked");
//		WebDriverWait wait = new WebDriverWait(driver,120);		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(categories)));
		
		List<MobileElement> list = driver.findElements(categoriesNames);
		System.out.println("Categories visible = " +list.size());
		for(MobileElement azx : list){
			System.out.println("Categories and links displaying in navigation drawer are = " +azx.getText());
		}
	}
		
	// All categories names present
	public void allCategoriesNamesPresent() throws InterruptedException{
//		WebDriverWait wait1 = new WebDriverWait(driver,90);
//		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(hamburgerIcon)));
		Thread.sleep(3000L);
		driver.findElement(hamburgerIcon).click();
//		WebDriverWait wait = new WebDriverWait(driver,120);		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(viewAllLink)));
		Thread.sleep(3000L);
		driver.findElement(viewAllLink).click();
		System.out.println("View All link clicked");
		Thread.sleep(3000L);
		List<MobileElement> list = driver.findElements(categoriesNames);
		System.out.println("Categories count after tapping on View All link = " +list.size());
		//driver.scrollTo("Bearings");
		
		for(MobileElement azx : list){
			System.out.println("Categories names after tapping on View All link = " +azx.getText());
		}
		
	}
	
	// Navigate to Category List page
	public CategoriesListPage navigateToCategoryList() throws InterruptedException{
		WebDriverWait wait1 = new WebDriverWait(driver,220);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(hamburgerIcon)));
		Thread.sleep(3000L);
		driver.findElement(hamburgerIcon).click();
		WebDriverWait wait2 = new WebDriverWait(driver,30);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(viewAllLink)));
		driver.findElement(viewAllLink).click();
		//driver.scrollToExact("Bearings");
		
		List<MobileElement> list = driver.findElements(categoriesNames);
		System.out.println("Size is = " +list.size());
		Thread.sleep(3000L);
		list.get(1).click();
		Thread.sleep(3000L);
		List<MobileElement> list1 = driver.findElements(By.xpath("//android.widget.LinearLayout"
				+ "/android.widget.LinearLayout/android.widget.TextView"));
		Thread.sleep(3000L);
		list1.get(1).click();
		Thread.sleep(3000L);
		WebDriverWait wait3 = new WebDriverWait(driver,240);
		wait3.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.view.View/android.support.v4.widget.DrawerLayout"
				+ "/android.view.View/android.widget.LinearLayout/android.view.View"
				+ "/android.widget.Spinner/android.widget.TextView[@text='Safety Shoes (766)']"))));
		
		System.out.println("Name of the category = " +driver.findElement(By.xpath("//android.view.View/android.support.v4.widget.DrawerLayout"
				+ "/android.view.View/android.widget.LinearLayout/android.view.View"
				+ "/android.widget.Spinner/android.widget.TextView[@text='Safety Shoes (766)']")).getText());
		return new CategoriesListPage(driver);
	}
		
	
	
	}
	




