package com.mehedi.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class wait extends BaseDriver{
	@BeforeSuite
	public void openUrl() {
		drive.get("https://demoqa.com/automation-practice-form");
	}
	@Test
    public void expliciWait() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait( drive, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"firstName\"]")));
        WebElement firstname = drive.findElement(By.xpath("//*[@id=\"firstName\"]"));
        firstname.sendKeys("Mehedi");
        Thread.sleep(3000);
    }
}
