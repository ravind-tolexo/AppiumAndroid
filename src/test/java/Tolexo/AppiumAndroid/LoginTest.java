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

public class LoginTest extends Setup {
	AndroidDriver driver;
	Setup obj = new Setup();
	HomePage objHome;
	LoginPage objLogin; 
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException, InterruptedException{
		
		prepareAndroidForAppium();
		this.driver = getDriver();
		Thread.sleep(5000L);
		objHome = new HomePage(driver);
	
	}

		// TC_01 >> To make member login and logout
		//@Test(priority=0)
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
		
		// TC_06 >> To make user register 
		@Test(priority=5)
		public void userRegister() throws InterruptedException{
			objLogin = objHome.navigateToLoginPage();
			Thread.sleep(3000L);
			objLogin.registerFlow();
			
		}
		
		@AfterClass
		public void quit(){
			driver.quit();
		}
	

	}

