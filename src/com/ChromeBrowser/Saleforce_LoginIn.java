package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saleforce_LoginIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.id("password")).sendKeys("hello");
		// driver.findElement(By.id("Login")).click();
		// this is by using xpath and clikc it
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		// get the webelement
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}

}
