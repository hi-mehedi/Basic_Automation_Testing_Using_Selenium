package com.mehedi.xPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class getAttribute extends BaseDriver{
	  @BeforeSuite
	  public void openUrl() {
    	  drive.get("https://demoqa.com/automation-practice-form");
      }
      @SuppressWarnings("deprecation")
	@Test
      public void x_path() throws InterruptedException {
    	  WebElement  Valuget = drive.findElement(By.xpath("//input[@id='firstName']"));
    	  System.out.println(Valuget.getAttribute("placeholder"));
    	  Thread.sleep(3000);
      }

}


    


