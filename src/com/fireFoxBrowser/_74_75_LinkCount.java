package com.fireFoxBrowser;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _74_75_LinkCount {

	private static final String Assert = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		// find count of links on whole page
		int linkCount = driver.findElements(By.tagName("a")).size();
		System.out.println("Links count on the Page: " + linkCount);
		
		// find the count of links on footer
		WebElement footer = driver.findElement(By.xpath("//*[@id='gf-BIG']"));
		int footerLinkCount = footer.findElements(By.tagName("a")).size();
		System.out.println("the Count of links on the footer:"+footerLinkCount);
		
		// find the count of the links on one section
		WebElement col = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		int secLinkCount = col.findElements(By.tagName("a")).size();
		System.out.println("The count of links on the section:"+secLinkCount);
		
		
		// get the all links innertext
		/*
		for(int i=0; i<secLinkCount; i++){
			System.out.println(col.findElements(By.tagName("a")).get(i).getText());
		}
		*/
		String BeforeClick = null;
		String AfterClick;
		
		// click one of the link
		for(int i=0; i<secLinkCount; i++){
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Stores")){
				System.out.println(driver.getTitle());
				BeforeClick = driver.getTitle();
				col.findElements(By.tagName("a")).get(i).click();
				break;
			};
		}
		System.out.println(driver.getTitle());
		AfterClick = driver.getTitle();
		
		if(BeforeClick!=AfterClick){
			boolean abc =driver.findElement(By.xpath("//div[@id='what-is-ebay-store']/div/h2")).isDisplayed();
			if(abc==true){
				System.out.println("PASS");
			}		
		}else{
			System.out.println("FAIL");
		}
		
		
		

	}

}
