package Tolexo.AppiumAndroid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	AndroidDriver driver;
	HomePage objHome = new HomePage(driver);
	

	By header = By
			.xpath("//android.view.View[@index='0']/android.widget.ImageButton[@index='0']/android.widget.TextView[@text='Login']/"
					+ "android.support.v7.widget.LinearLayoutCompat[@index='2']");
	By backArrow = By.xpath("//android.view.View/android.widget.ImageButton[@index='0']");
	By loginSignUpButton = By
			.xpath("//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/"
					+ "/android.widget.TextView[@text='Sign Up']");
					
	By email = By.xpath("//android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout[@index='0']"
			+ "/android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@text='EMAIL']/android.widget.EditText[@index='0']");
	By password = By.xpath("//android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout[@index='0']"
			+ "/android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@text='PASSWORD']/android.widget.EditText[@index='0']");
	By loginButton = By.xpath("//android.widget.Button[@text='Login']");
	By logout = By.xpath("//android.widget.TextView[@text='Logout']");
	By finalLogout = By.xpath("//android.widget.Button[@text='Logout']");
	By forgotPassword = By.xpath("//android.widget.TextView[@text='Forgot Password?']");
	By forgotPasswordEmail = By.xpath("//android.widget.LinearLayout[@text='EMAIL']");
	By forgotSubmitButton = By.xpath("//android.widget.Button[@text='Submit']");
	By loginLabel = By.xpath("//android.widget.TextView[@text='Login']");
	By searchIcon = By.xpath("//android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[@index='0']");
	By cartIcon = By.xpath("//android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout[@index='1']");
	By ellipseIcon = By.xpath("//android.support.v7.widget.LinearLayoutCompat/android.widget.ImageView[@index='2']");
	By googlePlusButton = By.xpath("//android.widget.Button[@index='Login via Google+']");
	By registerFirstName = By.xpath("//android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[@index='1']/android.widget.EditText");
	By registerLastName = By.xpath("//android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[@index='2']/android.widget.EditText");
	By registerEmail = By.xpath("//android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[@index='3']/android.widget.EditText");
	By registerPassword = By.xpath("//android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[@index='4']/android.widget.EditText");
	By registerConfirmPassword = By.xpath("//android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[@index='5']/android.widget.EditText");
	By registerButton = By.xpath("//android.widget.Button[@text='Register']");
	

	// Constructor
	public LoginPage(AndroidDriver driver) {
		this.driver = driver;
	}
	
	// Navigate to Checkout Page
	public CheckoutPage navigateToCheckout() throws InterruptedException{
		driver.findElement(email).sendKeys("ravind.nayar@tolexo.com");
		driver.findElement(password).sendKeys("qwerty");
		System.out.println("Member successfully login");
		//driver.hideKeyboard();
		// tap on login button
		WebDriverWait wait2 = new WebDriverWait(driver, 90);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(loginButton)));
		driver.findElement(loginButton).click();
		Thread.sleep(3000L);
		return new CheckoutPage(driver);
		
		
	}

	// Login label and headers present
	public void labelHeadersPresent() {
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(backArrow)));
		driver.findElement(backArrow).isDisplayed();
		System.out.println("Login Label is present = " +driver.findElement(loginLabel).getText());
		driver.findElement(searchIcon).isDisplayed();
		driver.findElement(cartIcon).isDisplayed();
		driver.findElement(ellipseIcon).isDisplayed();	

	}

	// Login and SignUp tabs present
	public void loginSignUpButton() {
		List<MobileElement> list = driver.findElements(loginSignUpButton);
		System.out.println("" + list.size());
	}

	// Member login
	public void memberLogin() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(email)));
		driver.findElement(email).sendKeys("ravind.nayar@tolexo.com");
		//driver.hideKeyboard();
		// enter password
		WebDriverWait wait1 = new WebDriverWait(driver, 120);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(password)));
		driver.findElement(password).sendKeys("qwerty");
		System.out.println("Member successfully login");
		//driver.hideKeyboard();
		// tap on login button
		WebDriverWait wait2 = new WebDriverWait(driver, 90);
		wait2.until(ExpectedConditions.visibilityOf(driver
				.findElement(loginButton)));
		driver.findElement(loginButton).click();
		Thread.sleep(3000L);
		
		
		
	}

	// Tap on logout link
	public void tapOnLogout() {
		driver.scrollTo("Logout");
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(logout)));
		// scroll till Logout link
		driver.findElement(logout).click();
		driver.findElement(finalLogout).click();
		System.out.println("Member successfully logout");
	}
	
	// Navigate to forgot password
	public void navigateToFrogotPassword(){
		driver.findElement(forgotPassword).click();
	}
	
	// Enter email id in forgot password page and click on Submit button
	public void enterEmailForgotPassword(){
		driver.findElement(forgotPasswordEmail).sendKeys("ravind.nayar@tolexo.com");
		driver.findElement(forgotSubmitButton).click();
	}
		
	// Tap on GooglePlus button
	public void googlePlus(){
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(googlePlusButton)));
		driver.findElement(googlePlusButton).click();
	}
		
	// SignUp Flow
	public void signUpFlow() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(loginSignUpButton)));
		driver.findElement(loginSignUpButton).click();
		System.out.println("SignUp tab tapped");
		Thread.sleep(3000L);
		driver.findElement(registerFirstName).sendKeys("Ravind");
		driver.findElement(registerLastName).sendKeys("Nayar");
		driver.findElement(registerEmail).sendKeys("op@mailinator.com");
		driver.findElement(registerPassword).sendKeys("qwerty");
		driver.findElement(registerConfirmPassword).sendKeys("qwerty");
		driver.findElement(registerButton).click();
		System.out.println("User successfully registered");
				
	}
	
	}

