package com.fireFoxBrowser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FromMethods_53_54_55 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cheapoair.com/");
		
		Boolean a = driver.findElement(By.xpath("//*[@id='arrivalCalendar_0']")).isDisplayed();
		System.out.println(a);
		
		driver.findElement(By.xpath("//*[@id='owFlight']")).click();
		
		// isDisplayed is only used when we want to see particular is visible or not.
		Boolean b = driver.findElement(By.xpath("//*[@id='arrivalCalendar_0']")).isDisplayed();
		System.out.println(b);
		
		// we can use.size when we have home page and reg page and if we wana go to reg page we can assing some property to 0 and if it is 0, means we landed next page
		// below code will fail
		// driver.findElements(By.xpath("//*[@id='arrivalCalendar_0']")).size();
		
		// isEnabled method, isSelected, isDisplayed
		
		//getText method
		// System.out.println(driver.findElement(By.xpath("//*[@id='flightStatSignIn']")).getText());
		
		// click the calendar and choose a date
		//driver.findElement(By.xpath("//input[@id='departCalendar_0'")).click();
		//driver.findElement(By.xpath("(//div[@class='calendar__single-month']/ol/div[14]/li[1])[1]")).click();
		
		int i=0;
		while(i<5){
			driver.findElement(By.xpath("//*[@id='ember777']")).click();
			i++;
		}
		
		
		// ===========================================
		// class # 57
		// Assert.assertTrue(condtion)
		
		
		
	}

}
