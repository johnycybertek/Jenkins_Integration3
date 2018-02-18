package com.fireFoxBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _66_ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// this is used to maximize the screen
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// this one help to move mouse to webelement
		Actions a = new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		
		// if we wana input capital letter like SHIFT+"abc"
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		// to click right, we have to use contextClick
		a.moveToElement(move).contextClick().build().perform();
		
		
		
		
		
	}

}
