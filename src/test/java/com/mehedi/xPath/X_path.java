package com.mehedi.xPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class X_path extends BaseDriver{
	  @BeforeSuite
	  public void openUrl() {
    	  drive.get("https://www.daraz.com.bd");
      }
      @Test
      public void x_path() throws InterruptedException {
    	  WebElement  search = drive.findElement(By.xpath("//*[@class='search-box__input--O34g']"));
    	  search.sendKeys("Power Bank");
    	  Thread.sleep(3000);
      }

}


    


