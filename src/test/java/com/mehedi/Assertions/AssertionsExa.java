package com.mehedi.Assertions;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.webautomation.bd.BaseDriver;

import junit.framework.Assert;

public class AssertionsExa extends BaseDriver {
	@BeforeSuite
      public void openUrl() {
    	  drive.get("https://demoqa.com/");
      }
      @Test (priority = 0)
      public void hardAssertion() throws InterruptedException {
    	  String expectedTitle = "DEMOQA";
    	  String actualTitle = drive.getTitle();
    	  Assert.assertEquals(expectedTitle, actualTitle);
    	  System.out.println("Title : "+actualTitle);
    	  Thread.sleep(2000);
    	  }
      @Test (priority = 1)
      public void softAssertion() throws InterruptedException {
    	  String expectedTitle = "DEMOQA";
    	  String actualTitle = drive.getTitle();
    	  SoftAssert softassert = new SoftAssert();
    	  softassert.assertEquals(expectedTitle, actualTitle);
    	  System.out.println("Check : "+actualTitle);
    	  softassert.assertAll();
    	  Thread.sleep(2000);
      } 

}
