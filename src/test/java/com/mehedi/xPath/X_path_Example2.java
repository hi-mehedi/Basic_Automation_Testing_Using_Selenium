package com.mehedi.xPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class X_path_Example2 extends BaseDriver{
	  @BeforeSuite
	  public void openUrl() {
    	  drive.get("https://www.daraz.com.bd");
      }
      @Test
      public void x_path() throws InterruptedException {
    	  WebElement  button = drive.findElement(By.xpath("//*[@class='links-list header-content BD en']/div[4]/a"));
    	  button.click();
    	  Thread.sleep(3000);
      }

}


    


