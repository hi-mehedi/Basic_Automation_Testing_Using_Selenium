package com.mehedi.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class LocateByPartialLinkText extends BaseDriver {
   @BeforeSuite
   public void openUrl() {
	   drive.get("https://demoqa.com/automation-practice-form");
   }
   @Test
   public void locateByTagName() throws InterruptedException {
	   List<WebElement> tag = drive.findElements(By.tagName("a"));
	   System.out.println("Tag :"+tag.size());
	   Thread.sleep(3000);
   }
   @AfterSuite
	public void closeChromeBrowser() {
		drive.quit();
	}
}
