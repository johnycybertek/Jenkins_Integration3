package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_com_E2E {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Ahmat");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("toshmat");
		driver.findElement(By.cssSelector("input#password")).sendKeys("toshmat");	
		driver.findElement(By.xpath("//input[contains(@name, 'procee')]")).click();
	
	
	}
	

}
