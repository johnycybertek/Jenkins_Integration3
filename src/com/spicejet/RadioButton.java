package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		// check radio buttons
	//	driver.findElement(By.xpath("//input[@value='Butter']")).click();
		
	//	System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		
		
		// clicking radio button without value. using 
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for(int i=0; i<count; i++){
			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click(); // using get we can put index
		String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"); // to print all innertext/value
			if(text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				break;
			}
		};
		
	
		
	}

}
