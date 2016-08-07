package Tolexo.AppiumAndroid;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Setup {
	AndroidDriver driver;
	
	 protected void prepareAndroidForAppium() throws MalformedURLException {
		 File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/Apps");
	        File app = new File(appDir, "tolexo-production-playStoreRelease-2.0.11 (1).apk");
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("device","Android");

	        //mandatory capabilities
	        capabilities.setCapability("deviceName","Android");
	        capabilities.setCapability("platformName","Android");

	        //other caps
	        capabilities.setCapability("app", app.getAbsolutePath());
	        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        capabilities.setCapability("appPackage", "com.fortysevendeg.android.swipelistview");
	        capabilities.setCapability("appActivity","com.fortysevendeg.android.swipelistview.sample.activities.SwipeListViewExampleActivity");
	    }
	 
	 public AndroidDriver getDriver(){
		 return driver;
	 }
	 
}
