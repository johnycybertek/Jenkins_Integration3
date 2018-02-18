package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LogIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// we will use xpath and css to identify
		// driver.findElement(By.xpath("//*[@id='email']")).sendKeys("toshmatjon");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ahmad");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("123455");
		
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		
		

	}

}
