package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		
		
	}

}
