package com.fireFoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts_class_50_51_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		// grab pop up box text
		System.out.println(driver.switchTo().alert().getText());
		
		// click positive alert 'OK'
		driver.switchTo().alert().accept(); // when we have pop up box when we need to handle it (ok or done)
		// if we need handle OK or cancel, we will use for negatives
	//  driver.switchTo().alert().dismiss();
		
		//if need to use input webedit to alert
	//	driver.switchTo().alert().sendKeys("Hellooo");
		
		
		
		
		
	}

}
