package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		/* this is used with xpath
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("ahmat");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("toshmat");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		*/
		
		// it is css way
		driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("hello");
		
		
		
	}

}
