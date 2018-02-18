package com.fireFoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _71_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		// find out how many frames we have in this website
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		// this is switching using index nymber, not recomended
		driver.switchTo().frame(0);
		
		// switching to frame by using webelement
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		//driver.findElement(By.xpath("//*[@id='draggable']")).click();
		
		Actions a=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
		// after we done with working insight frame need to get out from frame in order to other actions
		
		driver.switchTo().defaultContent();
		
		
	}

}
