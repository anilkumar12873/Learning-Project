package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {

    @Test
    public void searchShoes() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = driver.findElement(
                By.xpath("//input[@id='twotabsearchtextbox']"));

        element.sendKeys("shoes");

        driver.findElement(
                By.xpath("//input[@id='nav-search-submit-button']"))
                .click();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
