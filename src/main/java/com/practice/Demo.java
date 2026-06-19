package com.practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {  
    	//Testing local branch 
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement element= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       element.sendKeys("shooes");
       
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
        
        
        //driver.findElement(By.xpath("(//div[@class='a-cardui _Zmx1a_fluidQuadImageLabel_3b-Iv'])[1]")).click();
        //driver.findElement(By.id("(//i[@class='a-icon a-icon-checkbox'])[9]")).click();
       // driver.findElement(By.xpath("//span[text()='Nike']/preceding::i[@class='a-icon a-icon-checkbox'][1]")).click();
        
       // driver.findElement(By.xpath("//span[text()='PUMA']/precedind ::div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'][1]")).click();
        
        
       driver.findElement(By.xpath("//span[text() ='PUMA']/preceding::i[@class='a-icon a-icon-checkbox'][1]")).click();
       

       System.out.println(driver.getTitle());

       driver.quit();
    }
}