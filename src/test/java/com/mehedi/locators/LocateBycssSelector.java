package com.mehedi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class LocateBycssSelector extends BaseDriver {
   @BeforeSuite
   public void openUrl() {
	   drive.get("https://www.daraz.com.bd/");
   }
   @Test
   public void locateBycssSelector() throws InterruptedException {
	   WebElement button = drive.findElement(By.cssSelector("a.white"));
	   button.click();
	   Thread.sleep(3000);
   }
   @AfterSuite
	public void closeChromeBrowser() {
		drive.quit();
	}
}
