package com.mehedi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class LocateById  extends BaseDriver{
	   @BeforeSuite
	   public void openurl() {
		   drive.get("https://www.tutorialspoint.com/market/login.jsp");
	   }
	   @Test
       public void locateById() throws InterruptedException {
    	   WebElement phoneNumber = drive.findElement(By.id("login_email"));
    	    phoneNumber.sendKeys("01723547019");
    	    Thread.sleep(3000);
       }
}
