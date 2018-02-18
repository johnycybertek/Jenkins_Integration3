package com.fireFoxBrowser;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _68_69_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/SignUp");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/p/a")).click();
		// print title of parent webPage
		System.out.println(driver.getTitle());
		//
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		driver.switchTo().window(childId);
		// if i dont use wait 5 sec, it isnt printing, it takes time to get next windows title, so we have to use wait
		Thread.sleep(5000L);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
	}

}
