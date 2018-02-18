package com.fireFoxBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchroniz_63_64 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		
		//
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB); // entering TAbB
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		// explcit way to wait. it only wait 20 seconds for below code, doesnt effect others
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'New-York-Hotels-The-Roosevelt-Hotel')]")));		
		// d.until(ExpectedConditions.elementToBeClickable(locator))
		
		// one more way
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//a[contains(@href, 'New-York-Hotels-The-Roosevelt-Hotel')]")).click();
		
		
	}

}
