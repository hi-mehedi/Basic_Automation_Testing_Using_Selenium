package com.mehedi.watis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class ExplicitWait extends BaseDriver {
	
	@BeforeSuite
	public void opneUrl() {
		drive.get("https://demoqa.com/text-box");
	}
	@Test
	public void explicitWait() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(drive, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"usrName\"]")));
		WebElement search = drive.findElement(By.xpath("//*[@id=\"userName\"]"));
		search.sendKeys("PowerBank");
		Thread.sleep(5000);
	}

}
