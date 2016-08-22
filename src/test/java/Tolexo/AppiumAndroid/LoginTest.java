package Tolexo.AppiumAndroid;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Setup;

public class LoginTest extends Setup {
	AndroidDriver driver;
	Setup obj = new Setup();
	HomePage objHome;
	LoginPage objLogin; 
	CategoriesListPage objCategoryList;
	ProductPage objProduct;
	CartPage objCart;
	CheckoutPage objCheckout;
	
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		Thread.sleep(5000L);
		objHome = new HomePage(driver);
	
	}
	
	// Navigate to checkout page
	@Test(priority=0)
	public void navigateCheckoutPage() throws InterruptedException{
		objCategoryList = objHome.navigateToCategoryList();
		objProduct = objCategoryList.navigateToProduct();
		Thread.sleep(3000L);
		objCart = objProduct.navigateCart();
		objLogin = objCart.navigateLogin();
		objCheckout = objLogin.navigateToCheckout();
				
	}

		// TC_01 >> To make member login and logout
		@Test(priority=0)
		public void memberLoginLogout() throws InterruptedException, MalformedURLException{
			objLogin = objHome.navigateToLoginPage();
			Thread.sleep(6000L);
			objLogin.memberLogin();
			objLogin.tapOnLogout();
		}
		
		// TC_02 >> To check header present
		//@Test(priority=1)
		public void headerVisible() throws InterruptedException{
			objLogin = objHome.navigateToLoginPage();
			Thread.sleep(3000L);
			objLogin.labelHeadersPresent();
		}
		
		// TC_03 >> To check forgot password flow
		//@Test(priority=2)
		public void forgotPasswordFlow(){
			objHome.navigateToLoginPage();
			objLogin.navigateToFrogotPassword();
			objLogin.enterEmailForgotPassword();
			
		}
		
		// TC_04 >> To check Login via Google+ button present 
		//@Test(priority=3)
		public void loginGooglePlus() throws InterruptedException{
			objLogin = objHome.navigateToLoginPage();
			Thread.sleep(3000L);
			objLogin.googlePlus();		
					
		}
		
		// TC_05 >> To check Login via Facebook button present
		//@Test(priority=4)
		public void loginFacebook() throws InterruptedException{
			objLogin = objHome.navigateToLoginPage();
			Thread.sleep(3000L);
		}
		
		// TC_06 >> To make user SignUp
		//@Test(priority=5)
		public void userSignUp() throws InterruptedException{
			objLogin = objHome.navigateToLoginPage();
			Thread.sleep(3000L);
			objLogin.signUpFlow();
			
		}
		
		// Sprint1 >> TC_01 >> To make user login and logout
	//	@Test(priority=6)
		public void sprint1_loginAndlogout() throws InterruptedException{
			objLogin = objHome.navigateToLoginPage();
			Thread.sleep(6000L);
			objLogin.memberLogin();
			Thread.sleep(6000L);
			objLogin.tapOnLogout();
			Thread.sleep(6000L);
		}
			
		// Sprint1 >> TC_02 >> To make user SignUp
		//@Test(priority=7)
		public void sprint1_userSignUp() throws InterruptedException{
			objLogin = objHome.navigateToLoginPage();
			Thread.sleep(6000L);
			objLogin.signUpFlow();
					
		}
		
	
		
		
		@AfterClass
		public void quit(){
			driver.quit();
		}
	

	}


