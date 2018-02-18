package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		// we open the faceBoook and enter uid and pwd
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*
		// facebook.com
		driver.get("http://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("myPassword");
		driver.findElement(By.linkText("Forgot account?")).click();
		*/
		
		
		// saleforce.com
	}

}
