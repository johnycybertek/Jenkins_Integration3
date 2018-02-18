package com.USPS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchedulePickUp {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.usps.com/");
		
		// compare the url with
		String actual_URL =driver.getCurrentUrl();
		String expected_URL="https://www.usps.com/";
		if(actual_URL.equals(expected_URL)){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//li[@class='menu--tier-one-category--mail-ship'])[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='c1408854645159']/nav/ol/li[4]/a")).click();
		
		// enterning personal information
		WebDriverWait d = new WebDriverWait(driver,10); // explicit wait times. it will wait 10 sec until my xpath appears. 
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tFName']")));
		driver.findElement(By.xpath("//input[@id='tFName']")).sendKeys("Ahmat");
		driver.findElement(By.xpath("//input[@id='tLName']")).sendKeys("Toshmat");
		driver.findElement(By.xpath("//input[@id='tPhone']")).sendKeys("2693386677");
		driver.findElement(By.xpath("//input[@id='tAddress']")).sendKeys("2662 S Embers Ln");
		driver.findElement(By.xpath("//input[@id='tCity']")).sendKeys("Arlington Heights");
		// here i have to select State
		driver.findElement(By.xpath("//*[@id='sStateList']/div[1]/span")).click();
		driver.findElement(By.xpath("")).click();
		
		//Select s=new Select(driver.findElement(By.("//*[@id='sStateList']/div[1]/span")));
		//s.selectByValue("IL - Illinois");
		// enter the ZIP code
		driver.findElement(By.xpath("//input[@id='tZip']")).sendKeys("60005");
		
		
		/*
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2"); // go to code and there is value 
		s.selectByIndex(6); // this one goes by index starting from 0
		s.selectByVisibleText("3"); // this one goes by innertext value, whatever we see on UI
		*/
	}

}