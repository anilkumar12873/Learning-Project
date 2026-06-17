package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample 
{
	public static void main(String args[]) throws InterruptedException {
		
//		 WebDriver driver = new ChromeDriver();
//		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		 
//		 driver.get("https://www.amazon.in/");
//		 //driver.findElement(By.xpath("(//div[@class='a-cardui _Zmx1a_fluidQuadImageLabel_3b-Iv'])[1]")).click();
//		 driver.findElement(By.xpath("(//div[contains(@class,'a-cardui')])[1]")).click();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll to Y-coordinate 2000
		js.executeScript("window.scrollTo(0, 2000)");
	}

}
