package com.fireFoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		// System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		// this one close all browsers
		String actualBrowser = driver.getCurrentUrl();
		String ExpectedBroswer = "https://www.google.com/";
		if(actualBrowser==ExpectedBroswer){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		
		driver.close();
	}

}
