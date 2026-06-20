package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleSelect 
{
	public static void main(String args[]) {
		
		//Tester work
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		Select dropdown = new Select(
			    driver.findElement(By.xpath("//select[@id='searchDropdownBox']"))
			);

//			dropdown.selectByVisibleText("Books");
		
		dropdown.selectByIndex(7);
			
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			
//			 driver.findElement(By.xpath("//span[text() ='PUMA']/preceding:://span[@dir='auto'][1]")).click();
			
			System.out.println( driver.getTitle());
		
//		driver.quit();
	}

}
