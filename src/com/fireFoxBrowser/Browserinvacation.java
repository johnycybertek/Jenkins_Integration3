package com.fireFoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvacation {

	public static void main(String[] args) {
	
		// System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
	//	WebDriver driver=new FirefoxDriver();
	//driver.get("https://www.google.com/");
	//System.out.println(driver.getTitle());
	
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	
	}

}
