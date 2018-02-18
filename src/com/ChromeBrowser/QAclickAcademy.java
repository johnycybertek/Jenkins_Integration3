package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAclickAcademy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		
	//	driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
	//	driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
	//	driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
		
		// i am gona use later to highlight when i learn it
	// driver.findElement(By.xpath("//*[@id='tablist1-tab1']/parent::ul"))
		
		// lets try with text way when built isnt ready. it is not working thou. generaly testers wont use it
	//	driver.findElement(By.xpath("//li[text()=' Selenium '")).click();
		
	
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		
		
		
	}

}
