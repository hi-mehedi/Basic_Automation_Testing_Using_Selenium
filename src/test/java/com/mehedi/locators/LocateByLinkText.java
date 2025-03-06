package com.mehedi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class LocateByLinkText extends BaseDriver {
   @BeforeSuite
   public void openUrl() {
	   drive.get("https://www.facebook.com");
   }
   @Test
   public void locateByLink() throws InterruptedException {
	   WebElement link = drive.findElement(By.linkText("Forgotten password?"));
	   link.click();
	   Thread.sleep(3000);
   }
   @AfterSuite
	public void closeChromeBrowser() {
		drive.quit();
	}
}
