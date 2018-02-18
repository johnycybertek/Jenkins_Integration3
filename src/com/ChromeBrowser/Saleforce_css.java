package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saleforce_css {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("pasw111");
		// this is ideantify with Id
	//	driver.findElement(By.cssSelector("input[id='Login']")).click();
		// this is ideantify with classname
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
		
		
		
	}

}
