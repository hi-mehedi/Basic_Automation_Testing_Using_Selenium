package com.mehedi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class LocateByName extends BaseDriver {
   @BeforeSuite
   public void openUrl() {
	   drive.get("https://www.facebook.com");
   }
   @Test
   public void locateByName() throws InterruptedException {
	   WebElement name = drive.findElement(By.name("email"));
	   name.sendKeys("mehedihasan.mehedi607@gmail.com");
	   Thread.sleep(3000);
   }
   @AfterSuite
	public void closeChromeBrowser() {
		drive.quit();
	}
}
