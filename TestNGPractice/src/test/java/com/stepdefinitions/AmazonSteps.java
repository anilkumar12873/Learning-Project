package com.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {

    WebDriver driver;

    @Given("User launches Amazon website")
    public void launchAmazon() {

        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }

    @When("User enters {string} in search box")
    public void enterProduct(String product) throws InterruptedException {

//        driver.findElement(By.id("twotabsearchtextbox"))
//                .sendKeys(product);
    	Thread.sleep(3000);
    	WebElement element = driver.findElement(
                By.xpath("//input[@id='twotabsearchtextbox']"));
    	Thread.sleep(3000);
        element.sendKeys("shoes");
    }

    @When("User clicks search button")
    public void clickSearch() {

        driver.findElement(By.id("nav-search-submit-button"))
                .click();
    }

    @Then("Search results should be displayed")
    public void verifyResults() {

        Assert.assertTrue(driver.getTitle().contains("shoes"));

        driver.quit();
    }
}