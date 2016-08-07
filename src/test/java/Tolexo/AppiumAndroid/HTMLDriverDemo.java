package Tolexo.AppiumAndroid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLDriverDemo {

	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String value = driver.findElement(By.xpath("//input[@id='vfb-11']")).getAttribute("value");

		System.out.println(value);
	}

}
